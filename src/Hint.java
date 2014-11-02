//Ben Wagner

//Put name at top if you contributed^ 

public class Hint { //="Hints"
	
	private String hint; 
	private boolean isUsed;
	private int X, Y, value;
	
	public Hint() {
		String hint = "pss...pss";//placeholder
		isUsed = false;
	}
	
	public boolean isHintUsed() {
		return this.isUsed;
	}
	
	public Hint getHint(PlayBoard board) {
		this.isUsed = true;
		/*
		 * Code to operate on board here 
		 */
		this.X = 1;
		this.Y = 1;
		this.value = board.getSolutionAt(X, Y);
		return this;
	}
	
	public int getHintX() {
		return X;
	}
	
	public int getHintY() {
		return Y;
	}
	
	public int getHintValue() {
		return value;
	}
}
