//Ben Wagner
import java.util.ArrayList;

public class PlayCell {
	private final static int SIZE = 10;
	private int value;//letters for larger boards could be stored as ints > 9
	private boolean fixedValue;//game generated values for cells cannot be changed
	private boolean[] pencilArray;//index equals value, true means number is penciled in	
		
	public PlayCell(int cellValue, boolean isCellfixed) {
		this.value = cellValue;
		this.fixedValue = false;
		this.pencilArray = clearPencilArray();
	}
	
	public void pencilIn(int num) {
		this.pencilArray[num] = true;
	}
	
	public void erase(int num) {
		this.pencilArray[num] = false;
	}	
	
	public int getValue() {
		return this.value;
	}
	
	public String getValueString() {
		return Integer.toString(this.getValue());
	}
	
	public boolean isLocked() {
		return this.fixedValue == true;
	}
	
	private static boolean[] clearPencilArray() {
		boolean[] result = new boolean[SIZE];
		for(int ii = 0; ii < SIZE; ii++) {
			result[ii] = false;
		}
		return result;
	}
//--------------------------------
}
