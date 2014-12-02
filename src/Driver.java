//Ben Wagner

//Put name at top if you contributed^
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Driver extends JPanel implements ActionListener {
	static Player gamePlayer;
	static int hintNumber = 1;
	static JFrame sudokuFrame;
	static JTextField[][] sudokuFields; 
	
	private static final long serialVersionUID = 1L;
	static  GridBagConstraints gbc = new GridBagConstraints();
	static JPanel the_grid = new JPanel();
	static JTextArea status_pane = new JTextArea ();
	static int board [] [] = new int [9] [9] ;
	static BitSet [] [] bits = new BitSet [9] [9];
	boolean loaded_flag = false, stuck = false, full_rescan = false, phase_one_complete = false;
	int todo = 0, progress = 0;
	int me_x = 0, me_y = 0;
	static Color saved_bg;
	Color my_blue = new Color (200, 200, 255);
	Color different_blue = new Color (150, 190, 250);
	Color my_green = new Color (200, 255, 200);
	Color my_red = new Color (255, 180, 180);
	int debug_level = 0;
	static final boolean DEBUG = false;
	static JFrame the_frame;		// So we can get hold of title and change it.

	
	public static void main(String[] args) throws IOException {
		String name="Bob";
		int difficultyLevel = 1;
		sudokuFrame = new JFrame("Sudoku Game");
		
	
		
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


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}	
	