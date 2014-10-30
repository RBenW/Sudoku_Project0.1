//Ben Wagner

//Put name at top if you contributed^ 

public class Puzzle {
	
	int numberHints;
	PlayBoard board;
	String difficulty;
	int difficultyRating;
	private int timeLimit;
	
	public Puzzle() {
		this.board = new PlayBoard();
		
	}
	
	public Puzzle(PlayBoard gameboard, String filename) {
		this.board = importPlayBoard(filename);
	}
	
	public int getTimeLimit() {
		return this.timeLimit;
	}
	
	public PlayBoard importPlayBoard (String filename) {//needs to be coded, not necessary for now
		return basePlayBoard();
	}
	
	public int detectDifficulty() {
		return this.difficultyRating;
	}
	
	
	public PlayBoard basePlayBoard() {//to be deleted later, only for testing
		PlayBoard defaultBoard = new PlayBoard(null, null, 9, 9);
		int[][] examplePattern = 
			{
			{1,4,7,  2,5,8,  3,6,9},
			{2,5,8,  3,6,9,  4,7,1},
			{3,6,9,  4,7,1,  5,8,2},
			
			{4,7,1,  5,8,2,  6,9,3},
			{5,8,2,  6,9,3,  7,1,4},
			{6,9,3,  7,1,4,  8,2,5},
			
			{7,1,4,  8,2,5,  9,3,6},
			{8,2,5,  9,3,6,  1,4,7},
			{9,3,6,  1,4,7,  2,5,8},
			};
		
		PlayCell[][] defaultCells = new PlayCell[9][9];
		for(int ii = 0; ii < defaultCells.length; ii++) {
			for(int ix = 0; ix < defaultCells[0].length; ix++) {
				defaultCells[ii][ix] = new PlayCell(examplePattern[ii][ix], ((int) (Math.random()*10)) == 5, defaultCells.length);
			}
		}
		
		defaultBoard.setSolutionPattern(examplePattern);
		defaultBoard.setBoardPattern(defaultCells);
		
		return defaultBoard;
	}
}
