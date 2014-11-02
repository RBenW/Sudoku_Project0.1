//Ben Wagner

//Put name at top if you contributed^ 
public class PlayBoard {

	private PlayCell[][] BoardPattern;
	private int[][] SolutionPattern;
		
	private int boardDimension;
	private int chunkDimension;
	
	public PlayBoard() {
		this.BoardPattern = null;
		this.SolutionPattern = null;
		this.boardDimension = 0;
		this.chunkDimension = 0;
	}
	
	public PlayBoard(PlayCell[][] playPattern, int[][] solutionPattern, int boardSize, int chunkSize) {
		this.BoardPattern = playPattern;
		this.SolutionPattern = solutionPattern;
		this.boardDimension = boardSize;
		this.chunkDimension = chunkSize;
	}//tested
	
	//----------------------------------------------------------------
	//Methods original to this level of architecture
	//----------------------------------------------------------------
	
	public int getBoardDimension() {
		return this.boardDimension;
	}
	
	public int getChunkDimension() {
		return this.chunkDimension;
	}
	
	public void setBoardPattern(PlayCell[][] solution) {
		this.BoardPattern = solution;
	}
	
	public void setSolutionPattern(int[][] solution) {
		this.SolutionPattern = solution;
	}
	
	private void setCell(int X, int Y, PlayCell value) {
		this.BoardPattern[Y][X] = value;
	}//tested
	
	private PlayCell getCell(int X, int Y) {
		return this.BoardPattern[Y][X];
	}//tested
	
	private PlayCell[] getRow(int row) {
		return this.BoardPattern[row];
	}//tested
	
	private PlayCell[] getColumn (int column) {
		PlayCell[] columnArray = new PlayCell[this.getBoardDimension()];
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			columnArray[ii] = this.getCell(column, ii);
		}
		return columnArray;
	}//tested
	
	/*Chunks are the 3 x 3 squares
	* They are numbered left to right, top to bottom
	* returns an array with results left to right, top to bottom
	* E.g. [a b c]
	*	   [d e f] -> [a b c d e f g h i]
	*	   [g h i]
	*/
	private PlayCell[] getChunk(int chunk) {
		PlayCell[] chunkArray = new PlayCell[this.getBoardDimension()];
		int startingX = (chunk - 1) % this.getChunkDimension() * this.getChunkDimension();
		int startingY = (chunk - 1) / this.getChunkDimension() * this.getChunkDimension();
		
		int index = 0;
		for(int iY = startingY; iY < startingY + this.getChunkDimension(); iY++) {
			for(int iX = startingX; iX < startingX + this.getChunkDimension(); iX++) {
				chunkArray[index] = getCell(iX, iY);
				index++;
			}
		}
		return chunkArray;
	}//tested
	
	private void setRow(int row, PlayCell[] RowArray) {
		this.BoardPattern[row] = RowArray;
	}//tested
	
	private void setColumn (int column, PlayCell[] columnArray) {
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			this.setCell(column, ii, columnArray[ii]);
		}		
	}//tested
	
	
	private void swapRow(int row1, int row2) {
		PlayCell[] buffer = new PlayCell[this.getBoardDimension()];
		buffer = this.getRow(row1);
		this.setRow(row1, this.getRow(row2));
		this.setRow(row2, buffer);
	}//tested
	
	private void swapColumn(int column1, int column2) {
		PlayCell[] buffer = new PlayCell[this.getBoardDimension()];
		buffer = this.getColumn(column1);
		this.setColumn(column1, this.getColumn(column2));
		this.setColumn(column2, buffer);
	}//tested
	
	private boolean validArray(PlayCell[] testedArray) {
		boolean hasDouble = false;
		for(int ii = 1; ii <= this.getBoardDimension() && hasDouble == false; ii++) {
			if(countInArray(ii, testedArray) > 1)
				hasDouble = true;
		}
		return !hasDouble;
	}//tested
	
	private boolean validRow (int row) {
		return validArray(this.getRow(row));
	}//tested
	
	private boolean validColumn (int column) {
		return validArray(this.getColumn(column));
	}//tested
	
	private boolean validChunk (int chunk) {
		return validArray(this.getChunk(chunk));
	}//tested
	
	public boolean validBoard() {
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			if(validRow(ii) == false || validColumn(ii) == false || validChunk(ii + 1) == false)
				return false;
		}
		return true;
	}//tested
	
	public String validityString() {
		String result = "";
		result += String.format("R = row, C = column, S = section%n");
		for(int ii = 0; ii < 9; ii++) {
			result += String.format("R%s: %4s, C%s: %4s, S%s: %4s%n", ii, this.validRow(ii), ii, this.validColumn(ii), ii+1, this.validChunk(ii + 1));
		}
		
		result += String.format("Board: %s%n%n", this.validBoard());
		
		result += this.toString();
		return result;
	}//tested
	
	
	
	private int countInArray(int target, int[] array) {
		int count = 0;
		for(int ii = 0; ii < array.length; ii++) {
			if(array[ii] == target)
				count++;
		}
		return count;
	}//tested
	
	private int countInArray(int target, PlayCell[] array) {
		int count = 0;
		for(int ii = 0; ii < array.length; ii++) {
			if(array[ii].getValue() == target)
				count++;
		}
		return count;
	}//tested
	
	public String toString() {
		String result = "";
		for(int iY = 0; iY < this.getBoardDimension(); iY++) {
			for(int iX = 0; iX < this.getBoardDimension(); iX++) {
				result = result + " " + this.getCell(iX, iY);
			}
			result = result + "\n";
		}
		return result;
	}//tested
	
	//----------------------------------------------------------------
	//Methods to work with lower levels of architecture and maintain encapsulation
	//----------------------------------------------------------------
	
	public void pencilIn(int X, int Y, int value) {
		this.getCell(X,Y).pencilIn(value);
	}	
	
	public void eraseInCell(int X, int Y, int value) {
		this.getCell(X, Y).erase(value);
	}
	
	public int getValueAt(int X, int Y) {
		return this.getCell(X, Y).getValue();
	}
	
	public boolean isCellLockedAt(int X, int Y) {
		return this.getCell(X, Y).isLocked();
	}
	
	public void eraseAllPencilAt(int X, int Y) {
		this.getCell(X, Y).clearPencilArray();
	}
	
	//----------------------------------------------------------------
	//Methods that probably will not be necessary
	//----------------------------------------------------------------	
	
	public void userSwapRow(int row1, int row2) {
		this.swapRow(row1 - 1, row2 - 1);
	}//tested
	
	public void userSwapColumn(int column1, int column2) {
		this.swapColumn(column1 - 1, column2 - 1);
	}//tested
		
	public PlayBoard rotateRight() {
		PlayBoard rotatedBoard = new PlayBoard();
		
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			rotatedBoard.setColumn(this.getBoardDimension() - 1 - ii, this.getRow(ii));
		}
		return rotatedBoard;
	}//tested
	
	public PlayBoard rotateLeft() {
		PlayBoard rotatedBoard = new PlayBoard();
		
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			rotatedBoard.setColumn(ii, reverseArray( this.getRow(ii) ) );
		}
		return rotatedBoard;
	}//tested
	
	public PlayBoard  flipVertical() {
		PlayBoard flippedBoard = new PlayBoard();
		
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			flippedBoard.setRow(ii, this.getRow(this.getBoardDimension() - 1 - ii));
		}
		return flippedBoard;
	}//tested
	
	public PlayBoard flipHorizontal() {
		 PlayBoard flippedBoard = new PlayBoard();
		
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			flippedBoard.setColumn(ii, this.getColumn(this.getBoardDimension() - 1 - ii));
		}
		return flippedBoard;
	}//tested
	
	private static int[] reverseArray(int[] sourceArray) {
		int[] newArray = new int[sourceArray.length];
		for(int ii = 0; ii < sourceArray.length; ii++) {
			newArray[ii] = sourceArray[sourceArray.length - 1 - ii];
		}
		return newArray;
	}//tested
	
	private static PlayCell[] reverseArray(PlayCell[] sourceArray) {
		PlayCell[] newArray = new PlayCell[sourceArray.length];
		for(int ii = 0; ii < sourceArray.length; ii++) {
			newArray[ii] = sourceArray[sourceArray.length - 1 - ii];
		}
		return newArray;
	}//tested
	
}