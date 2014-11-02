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
	//Methods to work with lower levels of architecture and maintain encapsulation principle
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
		return this.gamePuzzle.getBoardSize();
	}
	
	public int getChunkLength() {
		return this.gamePuzzle.getChunkSize();
	}
	
	public boolean checkBoardValidity() {//checks if the current board satisfies the basic requirements of Sudoku
		return this.gamePuzzle.isBoardValid();
	}	
	
	public boolean isBoardCorrect() {//checks if board matches solution
		return this.gamePuzzle.isCorrectBoard();
	}
	
	public int countIncorrectCells() {//determines number of incorrect cells
		return this.gamePuzzle.numberIncorrectCells();
	}
	
	//----From PlayCell----//
	
	public void pencilInNumberAt(int X, int Y, int value) {
		this.gamePuzzle.pencilInNumber(X, Y, value);
	}	
	
	public void eraseNumberAt(int X, int Y, int value) {
		this.gamePuzzle.eraseNumber(X, Y, value);
	}
	
	public void markNumberInPen(int X, int Y, int value) {
		this.gamePuzzle.writeValueInPen(X, Y, value);
	}	
	
	public int getValueAt(int X, int Y) {
		return this.gamePuzzle.getCellValue(X, Y);
	}
	
	public boolean isLockedAt(int X, int Y) {
		return this.gamePuzzle.isLockedCell(X, Y);
	}
	
	public void erasePencilMarksAt(int X, int Y) {
		this.gamePuzzle.clearPencilMarksInCell(X, Y);
	}		
}
