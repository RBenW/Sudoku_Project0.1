//Ben Wagner

//Put name at top if you contributed^ 
public class GameInstance { //="SudokuProgram"
	
	private Hint[] gameHints;
	private Puzzle gamePuzzle;

	public GameInstance() {
		this.gameHints = null;
		this.gamePuzzle = null;
	}
	
	public GameInstance(int difficultyLevel, String boardFileName) {
		this.gamePuzzle = getPuzzleForDifficulty(difficultyLevel, boardFileName);
		this.gameHints = resetHints();
	}
	
	//----------------------------------------------------------------
	//Methods original to this level of architecture
	//----------------------------------------------------------------
	
	private Puzzle getPuzzleForDifficulty(int difficultyLevel, String boardFileName) {
		switch (difficultyLevel) {
			case 1: return new EasyPuzzle(boardFileName);
			case 2: return new MediumPuzzle(boardFileName);
			case 3: return new HardPuzzle(boardFileName);
			case 4: return new EvilPuzzle(boardFileName);
			default: return null;
		}
		
	}
	
	private Hint[] resetHints() {
		Hint[] result = new Hint[this.gamePuzzle.getNumberHints()];
		for(int ii = 0; ii < result.length; ii++) {
			result[ii] = new Hint();
		}
		return result;
	}
	
	public int getHint() {
		return getHintHelper(0);
	}
	
	public int getHintHelper(int current) {
		if(!this.gameHints[current].isHintUsed())
			return current;
		else if (current >= gameHints.length - 1)
			return -1;
		else
			return getHintHelper(current + 1);
	}
	
	public void useHint(int hintNumber) {
		int X = getXHint(hintNumber);
		int Y = getYHint(hintNumber);
		int value = getValueHint(hintNumber);
		
		this.markNumberInPen(X, Y, value);
	}
	
	//----------------------------------------------------------------
	//Methods to work with lower classes
	//----------------------------------------------------------------

	//----From Puzzle----//
	
	public long getLimitTime() {
		return this.gamePuzzle.getTimeLimit();
	}
	
	public long getTimeRemaining() {
		return this.gamePuzzle.getRemainingTime();
	}
	
	public boolean hasGameEnded() {
		return this.gamePuzzle.isTimeLeft();
	}
	
	//----From Hint----//
	
	public int getXHint(int hintNumber) {
		return gameHints[hintNumber].getHintX();
	}
	
	public int getYHint(int hintNumber) {
		return gameHints[hintNumber].getHintY();
	}
	
	public int getValueHint(int hintNumber) {
		return gameHints[hintNumber].getHintValue();
	}
		
	//----From PlayBoard----//
	
	public int getBoardLength() {
		return this.gamePuzzle.board.getBoardDimension();
	}
	
	public int getChunkDimension() {
		return this.gamePuzzle.board.getChunkDimension();
	}
	
	public boolean validBoard() {//checks if the current board satisfies the basic requirements of Sudoku
		return this.gamePuzzle.board.validBoard();
	}	
	
	public boolean checkAgainstSolution() {//checks if board matches solution
		return this.gamePuzzle.board.checkAgainstSolution();
	}
	
	public int countIncorrectCells() {//determines number of incorrect cells
		return this.gamePuzzle.board.numberIncorrect();
	}
	
	//----From PlayCell----//
	
	public void pencilInAt(int X, int Y, int value) {
		this.gamePuzzle.board.pencilInAt(X, Y, value);
	}	
	
	public void eraseAt(int X, int Y, int value) {
		this.gamePuzzle.board.eraseAt(X, Y, value);
	}
	
	public void markNumberInPen(int X, int Y, int value) {
		this.gamePuzzle.board.writeInPenAt(X, Y, value);
	}	
	
	public int getValueAt(int X, int Y) {
		return this.gamePuzzle.board.getValueAt(X, Y);
	}
	
	public boolean isLockedAt(int X, int Y) {
		return this.gamePuzzle.board.isLockedAt(X, Y);
	}
	
	public void clearPencil(int X, int Y) {
		this.gamePuzzle.board.clearPencilAt(X, Y);
	}		
}
