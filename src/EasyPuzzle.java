import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.JPanel;

//Ben Wagner

//Put name at top if you contributed^ 

public class EasyPuzzle extends Puzzle {

	public final boolean DEBUG = false;
	
	private int numberHints = 5;
	private static String difficulty = "Easy";
	private int timeLimit = 20;
	private int difficultyRating = 1;
	
	public EasyPuzzle() throws IOException {
		super();
		this.setDifficulty("Easy");
	}
	
	public EasyPuzzle(String filename) throws IOException {
		super();
		this.board = importPlayBoard(filename);
	}
	
	public PlayBoard loadPuzzle() throws IOException {
		this.setDifficulty("Easy");
		PlayBoard newBoard = new PlayBoard(null, null, 9, 9);
		PlayCell[][] newBoard_Puzzle = new PlayCell[9][9];
		int[][] newBoard_Solution = new int[9][9];
		if(DEBUG)
			System.out.format("-------%n-------%n%s%n-------%n-------%n",this.getDifficulty());
		Random rand = new Random(1);
		String filename = String.format("src/%s/%s_%s.txt",this.getDifficulty(),this.getDifficulty(),Integer.toString(rand.nextInt(4) + 1));
		
		try {
			JPanel the_grid = new JPanel();
		
				FileReader fr = new FileReader (filename);  //load in specified file
				BufferedReader in = new BufferedReader (fr);
				String line;
				
				for(int index_s = 0; index_s < 9; index_s++) {
					line = in.readLine();
					
					if (line == null) throw new IOException ("Premature EOF");
					if(DEBUG) System.out.println("solution_row: " + index_s + ",");
					for(int ix = 0; ix < 9; ix++) {
						String value = Character.toString(line.charAt(ix));
						newBoard_Solution[index_s][ix] = Integer.parseInt(value);
						if(DEBUG) System.out.print("col: " + ix + ",");
					}
				}
				
					newBoard.setSolutionPattern(newBoard_Solution);
				
				for(int index_b = 0; index_b < 9; index_b++) {
					line = in.readLine();
					if (line == null) throw new IOException ("Premature EOF");
					if(DEBUG) System.out.println("board_row: " + index_b + ",");
					
					for(int iz = 0; iz < 9; iz++) {
						newBoard_Puzzle[index_b][iz] = new PlayCell(newBoard_Solution[index_b][iz], line.charAt(iz) != '0', newBoard_Puzzle.length);
						if(DEBUG) System.out.print("col: " + iz + ",");
					}
					newBoard.setBoardPattern(newBoard_Puzzle);
				}	
				
					
				
				/*
				Component [] panels = the_grid.getComponents();
				for (Component c : panels) {
					Component[] texts = ((Container) c).getComponents();
					line = in.readLine();
					if (line == null) throw new IOException ("Premature EOF");
					int i = 0;
					for (Component t :texts ) {
						String value = new String (line.substring(i,i+1));
						if (value.equals("0")) 
						{
							value = "";
							((JTextField) t).setEditable(true);
						}
						else
						{
							((JTextField) t).setText(value);
							((JTextField) t).setEditable(false);
						}
						((JTextField) t).setBackground(saved_bg);
						i++;
					}
					}
					*/
			} finally {
				
			}
		return newBoard;
		}
}
