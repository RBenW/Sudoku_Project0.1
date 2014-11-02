//Ben Wagner

//Put name at top if you contributed^ 
public class PlayCell {
	private static int highestNumber = 9;//highest number to penciled in, ie. 9.
	private int value;//letters for larger boards could be stored as ints > 9
	private boolean fixedValue;//game generated values for cells cannot be changed
	private boolean[] pencilArray;//index equals value, true means number is penciled in	
		
	public PlayCell(int cellValue, boolean isCellfixed, int upperBoundOfEntry) {
		this.value = cellValue;
		this.fixedValue = false;
		this.pencilArray = getClearedPencilArray();
		PlayCell.highestNumber = upperBoundOfEntry;
	}
	
	public void pencilIn(int num) {
		this.pencilArray[num - 1] = true;
	}
	
	public void erase(int num) {
		this.pencilArray[num - 1] = false;
	}	
	
	public void writeInPen(int number) {
		this.value = number;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isLocked() {
		return this.fixedValue == true;
	}
	
	private static boolean[] getClearedPencilArray() {
		boolean[] result = new boolean[highestNumber];
		for(int ii = 0; ii < highestNumber; ii++) {
			result[ii] = false;
		}
		return result;
	}
	
	public void clearPencilArray() {
		this.pencilArray = getClearedPencilArray();
	}
//--------------------------------
}