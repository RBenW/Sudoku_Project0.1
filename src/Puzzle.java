//Ben Wagner

//Put name at top if you contributed^ 

import java.util.Random;

public class Puzzle {
	
	protected int numberHints;
	protected PlayBoard board;
	protected String difficulty;
	protected int difficultyRating;
	protected long timeLimit;
	protected long startTime;
	protected boolean timeLeft;
	
	public Puzzle() {
		this.board = new PlayBoard();
		this.startTime = System.currentTimeMillis();
		this.timeLeft = true;
	}
	
	public Puzzle(String filename) {
		this.board = importPlayBoard(filename);
		this.startTime = System.currentTimeMillis();
		this.timeLeft = true;
	}
	
	//----------------------------------------------------------------
	//Methods original to this level of architecture
	//----------------------------------------------------------------
	
	public long getTimeLimit() { //in milliseconds
		return this.timeLimit;
	}
	
	public long getRemainingTime() { //in milliseconds
		return (timeLimit - startTime);
	}
	
	public boolean isTimeLeft() { // should be called regularly
		if(!timeLeft)
			return false;
		else
			return this.getRemainingTime() > 0;
	}
	
	public PlayBoard importPlayBoard (String filename) {//needs to be coded, not necessary for now
		return basePlayBoard();//hold-over for now
	}
	
	public int detectDifficulty() {
		return this.difficultyRating;
	}
	
	public String getDifficultyName() {
		return this.difficulty;
	}
	
	public int getNumberHints() {
		return this.numberHints;
	}
	
	public PlayBoard getBoard() {
		return this.board;
	}
	//----------------------------------------------------------------
	//Methods to work with lower levels of architecture and maintain encapsulation principle
	//----------------------------------------------------------------
	
	//----From PlayBoard----//
	/*
	public int getBoardSize() {
		return this.board.getBoardDimension();
	}
	
	public int getChunkSize() {
		return this.board.getChunkDimension();
	}
	
	public boolean isBoardValid() {
		return this.board.validBoard();
	}
		
	public boolean isCorrectBoard() {
		return this.board.checkAgainstSolution();
	}
	
	public int numberIncorrectCells() {
		return this.board.numberIncorrect();
	}
	*/ 
	//----From PlayCell----//
	/*
	public void pencilInNumber(int X, int Y, int value) {
		this.board.pencilIn(X, Y, value);
	}	
	
	public void eraseNumber(int X, int Y, int value) {
		this.board.eraseInCell(X, Y, value);
	}
	
	public int getCellValue(int X, int Y) {
		return this.board.getValueAt(X, Y);
	}
	
	public void writeValueInPen(int X, int Y, int value) {
		this.board.writePenAt(X, Y, value);
	}
	
	public boolean isLockedCell(int X, int Y) {
		return this.board.isCellLockedAt(X, Y);
	}
	
	public void clearPencilMarksInCell(int X, int Y) {
		this.board.eraseAllPencilAt(X, Y);
	}
	*/
	//----------------------------------------------------------------
	//Methods only for testing and debugging
	//----------------------------------------------------------------
		
	protected PlayBoard basePlayBoard() {//Debugging and testing only
		PlayBoard defaultBoard = new PlayBoard(null, null, 9, 9);
		Random random = new Random();
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
				defaultCells[ii][ix] = new PlayCell(examplePattern[ii][ix], random.nextBoolean(), defaultCells.length);
			}
		}
		
		defaultBoard.setSolutionPattern(examplePattern);
		defaultBoard.setBoardPattern(defaultCells);
		
		return defaultBoard;
	}
}
