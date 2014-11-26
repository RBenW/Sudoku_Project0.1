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
	
	public boolean validBoard() {
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			if(validRow(ii) == false || validColumn(ii) == false || validChunk(ii + 1) == false)
				return false;
		}
		return true;
	}//tested
	
	public boolean hasWon() {
		return numberIncorrect() == 0;
	}
	
	public int numberIncorrect() {
		int result = 0;
		for(int ii = 0; ii < getBoardDimension(); ii++) {
			for(int icolumn = 0; ii < getBoardDimension(); ii++) {
				if(BoardPattern[ii][icolumn].getPenValue() == SolutionPattern[ii][icolumn]) 
					result++;
			}
		}
		return result;
	}
	
	private void setCell(int row, int column, PlayCell value) {
		this.BoardPattern[row][column] = value;
	}//tested
	
	private PlayCell getCell(int column, int row) {
		return this.BoardPattern[row - 1][column - 1];
	}//tested
	
	public int getSolutionAt(int column, int row) {
		return this.SolutionPattern[row - 1][column - 1];
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
		int startingcolumn = (chunk - 1) % this.getChunkDimension() * this.getChunkDimension();
		int startingrow = (chunk - 1) / this.getChunkDimension() * this.getChunkDimension();
		
		int index = 0;
		for(int irow = startingrow; irow < startingrow + this.getChunkDimension(); irow++) {
			for(int icolumn = startingcolumn; icolumn < startingcolumn + this.getChunkDimension(); icolumn++) {
				chunkArray[index] = getCell(icolumn, irow);
				index++;
			}
		}
		return chunkArray;
	}//tested
	
	private void setRow(int row, PlayCell[] RowArray) {
		this.BoardPattern[row] = RowArray;
	}//tested
	
	private void setColumn(int column, PlayCell[] columnArray) {
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
	
	public String validityString() {
		String result = "";
		result += String.format("R = row, C = column, S = section\n");
		for(int ii = 0; ii < 9; ii++) {
			result += String.format("R%s: %4s, C%s: %4s, S%s: %4s\n", ii, this.validRow(ii), ii, this.validColumn(ii), ii+1, this.validChunk(ii + 1));
		}
		
		result += String.format("Board: %s\n\n", this.validBoard());
		
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
			if(array[ii].getPenValue() == target)
				count++;
		}
		return count;
	}//tested
	
	public String toString() {
		String result = "";
		
		for(int irow = 1; irow < this.getBoardDimension(); irow++) {
			for(int icolumn = 1; icolumn < this.getBoardDimension(); icolumn++) {
				
				result += this.getCell(icolumn, irow).toString();
			}
			result += "\n";
		}
		return result;
	}//tested
	
	//----------------------------------------------------------------
	//Methods to work with playCell and maintain encapsulation
	//----------------------------------------------------------------
	
	public void pencilInAt(int column, int row, int value) {
		this.getCell(column, row).pencilIn(value);
	}	
	
	public void eraseAt(int column, int row, int value) {
		this.getCell(column, row).erase(value);
	}
	
	public int getValueAt(int column, int row) {
		return this.getCell(column, row).getPenValue();
	}
	
	public void writeInPenAt(int column, int row, int value) {
		this.getCell(column, row).writeInPen(value);
	}
	
	public boolean isLockedAt(int column, int row) {
		return this.getCell(column, row).isLocked();
	}
	
	public void clearPencilAt(int column, int row) {
		this.getCell(column, row).clearPencil();
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

	private String isPenciled(int row, int column, int number) {
		if(this.getCell(row, column).getPenValue() > 0)
			return " ";
		else
			return this.getCell(row, column).isPenciled(number);
	}
	
	private String getPenOrPencil(int row, int column) {
		if(this.getCell(row, column).getPenValue() > 0)
			return Integer.toString(this.getCell(row, column).getPenValue());
		else
			return this.getCell(row, column).isPenciled(5);
	}
	
}