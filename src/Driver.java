//Ben Wagner

//Put name at top if you contributed^
import java.util.Scanner;

public class Driver {
	static Player gamePlayer;
	static int hintNumber = 1;
	
	public static void main(String[] args) {
		String name;
		int difficultyLevel = 0;
		
		Scanner myScanner = new Scanner(System.in);
		String input = "";
		System.out.format("Welcome to eighty-one%n%nHave you played before? (Y/N)%n");
		input = myScanner.nextLine();
		if(input.trim().equalsIgnoreCase("Y"))
			name = chooseExistingName();
		else {
			System.out.format("Please enter your name%n");
			name = myScanner.nextLine();
		}
		System.out.format("%nWhat difficulty level would you like to play?%n (1=easy, 2=medium, 3=hard, 4=evil)%n%n");
		difficultyLevel = promptForValidValue(1,4);
		
		gamePlayer = new Player(name, getTag(name), difficultyLevel);
		System.out.println(gamePlayer.getGameInstance().getBoard().toString());
		while(!gamePlayer.getGameInstance().hasWonGame()) {
			promptForMove(gamePlayer);
			System.out.println(gamePlayer.getGameInstance().getBoard().toString());
		}
		
		
		
		myScanner.close();
	}
	
	//----------------------------------------------------------------
	//The following methods are for the driver
	//----------------------------------------------------------------
	
	public static String chooseExistingName() { //will choose from saved file
		
		return "Bob";
	}
	
	public static int promptForValidValue(int lowerBound, int upperBound) {
		Scanner scan = new Scanner(System.in);
		boolean exit = false;
		int result = 0;
		System.out.format("Please enter a value between %s and %s%n",lowerBound, upperBound);	
		while(!exit) {
			result = scan.nextInt();
			if(result >= lowerBound || result <= upperBound) 
				exit = true;
			else
				System.out.format("Incorrect, please enter a value between %s and %s%n",lowerBound, upperBound);
		}

		return result;
	}
	
	public static String getTag(String name) {
		String result = "";
		for(int ii = 0; ii < name.length(); ii++) {
			int number = (int) (Math.pow((double) ((int) name.charAt(ii) - 'A' + 1), 37.0) % ((int) 'z'- (int) 'A') );
			result += number;
		}
		
		return result;
	}
	
	public static void promptForMove(Player gamePlayer) {
		
		System.out.format("Which move would you like to make?%n"
				+ "1-Pencil In%n"
				+ "2-Erase%n"
				+ "3-Erase square%n"
				+ "4-Mark In Pen%n"
				+ "5-Use white out%n"
				+ "6-Use Hint%n");
		int selector = promptForValidValue(1,6);
				
		switch (selector) {
				case 1: pencilIn();
				case 2: erase();
				case 3: eraseSquare();
				case 4: markInPen();
				//case 5: useWhiteOut();//needs to be written
				case 6: useHint();
				default: promptForMove(gamePlayer);
		}
	}
	
	//----------------------------------------------------------------
	//The following methods are methods the player has at disposal to play
	//----------------------------------------------------------------
	
	public static void pencilIn() {
		int row = 0;
		int col = 0;
		int value = 0;
		
		boolean exit = false;
		while(!exit) {
			System.out.format("Please enter which row: %n");
			row = promptForValidValue(1,9);
			System.out.format("Please enter which col: %n");
			col = promptForValidValue(1,9);
						
			if(!gamePlayer.getGameInstance().isLockedAt(row, col)) {
				exit = true;
			} else {
				System.out.format("That value is not user-editable.");
				//--------
				System.out.println("You selected" + gamePlayer.getGameInstance().getBoard().getValueAt(col, row));
				System.out.format("(1,1) = %s, (2,1) = %s, (3,1) = %s, (4,1) = %s%n",gamePlayer.getGameInstance().getBoard().getValueAt(1, 1),
						gamePlayer.getGameInstance().getBoard().getValueAt(2, 1),
						gamePlayer.getGameInstance().getBoard().getValueAt(3, 1),
						gamePlayer.getGameInstance().getBoard().getValueAt(4, 1));
				//--------
			}
			System.out.format("Please enter what value: %n");
			value = promptForValidValue(1,9);
		}
		gamePlayer.getGameInstance().pencilInAt(col, row, value);		
	}
	
	public static void erase() {
		int row = 0;
		int col = 0;
		int value = 0;
		
		boolean exit = false;
		while(!exit) {
			System.out.format("Please enter which row: %n");
			row = promptForValidValue(1,9);
			System.out.format("Please enter which col: %n");
			col = promptForValidValue(1,9);
			System.out.format("Please enter what value: %n");
			value = promptForValidValue(1,9);
			
			if(!gamePlayer.getGameInstance().isLockedAt(col, row))
				exit = true;
			else
				System.out.format("That value is not user-editable.");
		}
		gamePlayer.getGameInstance().eraseAt(col, row, value);		
	}
	
	public static void markInPen() {
		int row = 0;
		int col = 0;
		int value = 0;
		
		boolean exit = false;
		while(!exit) {
			System.out.format("Please enter which row: %n");
			row = promptForValidValue(1,9);
			System.out.format("Please enter which col: %n");
			col = promptForValidValue(1,9);
			System.out.format("Please enter what value: %n");
			value = promptForValidValue(1,9);
			
			if(!gamePlayer.getGameInstance().isLockedAt(col, row))
				exit = true;
			else
				System.out.format("That value is not user-editable.");
			//--------
			System.out.println("You selected" + gamePlayer.getGameInstance().getBoard().getValueAt(col, row));
			System.out.format("(1,1) = %s, (2,1) = %s, (3,1) = %s, (4,1) = %s%n",gamePlayer.getGameInstance().getBoard().getValueAt(1, 1),
					gamePlayer.getGameInstance().getBoard().getValueAt(2, 1),
					gamePlayer.getGameInstance().getBoard().getValueAt(3, 1),
					gamePlayer.getGameInstance().getBoard().getValueAt(4, 1));
			//--------
		}
		gamePlayer.getGameInstance().markNumberInPen(col, row, value);		
	}
	
	public static void eraseSquare() {
		int row = 0;
		int col = 0;
		
		boolean exit = false;
		while(!exit) {
			System.out.format("Please enter which row: %n");
			row = promptForValidValue(1,9);
			System.out.format("Please enter which col: %n");
			col = promptForValidValue(1,9);
			
			if(!gamePlayer.getGameInstance().isLockedAt(col, row))
				exit = true;
			else
				System.out.format("That value is not user-editable.");
		}
		gamePlayer.getGameInstance().clearPencil(col, row);		
	}
	
	public static void useHint() {
		gamePlayer.useHint(hintNumber);	
		hintNumber++;
	}
	
	
	
	
	
	
	
	
	
}
