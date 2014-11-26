//Ben Wagner

//Put name at top if you contributed^ 
public class PlayCell {
	private static int highestNumber = 9;//highest number to penciled in, ie. 9.
	private int correctValue;//letters for larger boards could be stored as ints > 9
	private int penValue;
	private boolean fixedValue;//game generated values for cells cannot be changed
	private boolean[] pencilArray;//index equals value, true means number is penciled in	
		
	public PlayCell(int correctValue, boolean isLocked, int upperBoundOfEntry) {
		this.correctValue = correctValue;
		if(isLocked) {
			penValue = correctValue;
		} else {
			penValue = 0;
		}
		this.fixedValue = isLocked;
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
		this.penValue = number;
	}
	
	public int getPenValue() {
		return this.penValue;
	}
	
	public int getCorrectValue() {
		return this.correctValue;
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
	
	public void clearPencil() {
		this.pencilArray = getClearedPencilArray();
	}
	
	public String toString() {
		if(!this.isLocked())
			return String.format("|%s|", this.getPenValue());
		else
			return String.format("[%s]", this.getPenValue());
	}
	
	public String isPenciled(int number) {//returns the number if it is in Pencil array, whitespace if not
		if(this.pencilArray[number] == true)
			return Integer.toString(number);
		else 
			return " ";
	}
//--------------------------------
}