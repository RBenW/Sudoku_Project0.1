//Ben Wagner

//Put name at top if you contributed^ 
public class GameInstance { //="SudokuProgram"
	
	private Hint[] gameHints;
	private Puzzle gamePuzzle;
	private String fileName;
	private String userName;
	
	public GameInstance() {
		this.gameHints = null;
		this.gamePuzzle = null;
		this.fileName = null;
	}
	
	public GameInstance(String boardFileName) {
		this.gamePuzzle = new Puzzle(boardFileName);
		this.fileName = boardFileName;
		this.gameHints = resetHints();
	}
	
	//----------------------------------------------------------------
	//Methods original to this level of architecture
	//----------------------------------------------------------------
	
	private Hint[] resetHints() {
		Hint[] result = new Hint[this.gamePuzzle.getRemainingHints()];
		for(int ii = 0; ii < result.length; ii++) {
			result[ii] = new Hint();
		}
		return result;
	}
	
	public Hint useHint() {
		return useHintHelper(0);
	}
	
	public Hint useHintHelper(int current) {
		if(!this.gameHints[current].isHintUsed())
			return gameHints[current];
		else if (current >= gameHints.length - 1)
			return null;
		else
			return useHintHelper(current + 1);
	}
	

	//----------------------------------------------------------------
	//Methods to work with lower levels of architecture and maintain encapsulation principle
	//----------------------------------------------------------------

	//----From PlayBoard----//
	
	public int getBoardLength() {
		return this.gamePuzzle.getBoardSize();
	}
	
	public int getChunkLength() {
		return this.gamePuzzle.getChunkSize();
	}
	
	public boolean checkBoardValidity() {
		return this.gamePuzzle.isBoardValid();
	}
	 
	//----From PlayCell----//
	
	public void pencilInNumberAt(int X, int Y, int value) {
		this.gamePuzzle.pencilInNumber(X, Y, value);
	}	
	
	public void eraseNumberAt(int X, int Y, int value) {
		this.gamePuzzle.eraseNumber(X, Y, value);
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
