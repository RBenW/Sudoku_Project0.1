//Ben Wagner

//Put name at top if you contributed^
import java.util.Scanner;

public class Driver {

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
		
		Player gamePlayer = new Player(name, getTag(name), difficultyLevel);

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
		while(!exit) {
			result = scan.nextInt();
			if(result >= lowerBound || result <= upperBound)
				exit = true;
		}
		scan.close();
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
	
	//----------------------------------------------------------------
	//The following methods are methods the player has at disposal to play
	//----------------------------------------------------------------
	
	
}
