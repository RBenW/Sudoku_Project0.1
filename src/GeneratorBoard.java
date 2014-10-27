//Ben Wagner

public class GeneratorBoard {
	
	private int[][] BoardPattern;
	private static final int[][] DEFAULT_BOARD_PATTERN = 
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
	
	private final int BOARD_DIMENSION = 9;
	private final int CHUNK_DIMENSION = 3;
	
	public GeneratorBoard() {
		this.BoardPattern = DEFAULT_BOARD_PATTERN;	
	}//tested
	
	private GeneratorBoard(int[][] userBoardPattern) {
		this.BoardPattern = userBoardPattern;
	}//tested
	
	public int getBoardDimension() {
		return this.BOARD_DIMENSION;
	}
	
	public int getChunkDimension() {
		return this.CHUNK_DIMENSION;
	}
	
	private int setCell(int X, int Y, int value) {
		this.BoardPattern[Y][X] = value;
		return value;
	}//tested
	
	private int getCell(int X, int Y) {
		return this.BoardPattern[Y][X];
	}//tested
	
	private int[] getRow(int row) {
		return this.BoardPattern[row];
	}//tested
	
	private int[] getColumn (int column) {
		int[] columnArray = new int[this.getBoardDimension()];
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			columnArray[ii] = this.getCell(column, ii);
		}
		return columnArray;
	}//tested
	
	/*Chunks are the 3 x 3 squares
	* They are numbered left to right, top to bottom
	* returns an array with results left to right, top to bottom
	* E.g. [1 2 3]
	*	   [4 5 6] -> [1 2 3 4 5 6 7 8 9]
	*	   [7 8 9]
	*/
	private int[] getChunk(int chunk) {
		int[] chunkArray = new int[this.getBoardDimension()];
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
	
	private void setRow(int row, int[] RowArray) {
		this.BoardPattern[row] = RowArray;
	}//tested
	
	private void setColumn (int column, int[] columnArray) {
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			this.setCell(column, ii, columnArray[ii]);
		}		
	}//tested
	
	public void userSwapRow(int row1, int row2) {
		this.swapRow(row1 - 1, row2 - 1);
	}//tested
	
	public void userSwapColumn(int column1, int column2) {
		this.swapColumn(column1 - 1, column2 - 1);
	}//tested
	
	private void swapRow(int row1, int row2) {
		int[] buffer = new int[this.getBoardDimension()];
		buffer = this.getRow(row1);
		this.setRow(row1, this.getRow(row2));
		this.setRow(row2, buffer);
	}//tested
	
	private void swapColumn(int column1, int column2) {
		int[] buffer = new int[this.getBoardDimension()];
		buffer = this.getColumn(column1);
		this.setColumn(column1, this.getColumn(column2));
		this.setColumn(column2, buffer);
	}//tested
	
	private boolean validArray(int[] testedArray) {
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
	
	public void printValidity() {
		System.out.format("R = row, C = column, S = section%n");
		for(int ii = 0; ii < 9; ii++) {
			System.out.format("R%s: %4s ", ii, this.validRow(ii));
			System.out.format("C%s: %4s ", ii, this.validColumn(ii));
			System.out.format("S%s: %4s%n", ii+1, this.validChunk(ii + 1));
		}
		
		System.out.format("Board: %s%n%n", this.validBoard());
		
		System.out.println(this.toString());
	}//tested
	
	private int countInArray(int target, int[] array) {
		int count = 0;
		for(int ii = 0; ii < array.length; ii++) {
			if(array[ii] == target)
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
	
	
	public GeneratorBoard rotateRight() {
		GeneratorBoard rotatedBoard = new GeneratorBoard(new int[9][9]);
		
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			rotatedBoard.setColumn(this.getBoardDimension() - 1 - ii, this.getRow(ii));
		}
		return rotatedBoard;
	}//tested
	
	public GeneratorBoard rotateLeft() {
		GeneratorBoard rotatedBoard = new GeneratorBoard(new int[9][9]);
		
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			rotatedBoard.setColumn(ii, reverseArray( this.getRow(ii) ) );
		}
		return rotatedBoard;
	}//tested
	
	public GeneratorBoard  flipVertical() {
		GeneratorBoard flippedBoard = new GeneratorBoard(new int[9][9]);
		
		for(int ii = 0; ii < this.getBoardDimension(); ii++) {
			flippedBoard.setRow(ii, this.getRow(this.getBoardDimension() - 1 - ii));
		}
		return flippedBoard;
	}//tested
	
	public GeneratorBoard flipHorizontal() {
		 GeneratorBoard flippedBoard = new GeneratorBoard(new int[9][9]);
		
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
	
	public PlayCell[][] toPlayCells() {
		PlayCell[][] newPlayBoard = new PlayCell[this.getBoardDimension()][this.getBoardDimension()];
		
		
		return null; 
		
	}
//--------------------------------
}