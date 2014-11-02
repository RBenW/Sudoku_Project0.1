//Ben Wagner

//Put name at top if you contributed^ 

public class Hint { //="Hints"
	
	private String hint; 
	private boolean isUsed;
	
	public Hint() {
		String hint = "pss...pss";//placeholder
		isUsed = false;
	}
	
	public boolean isHintUsed() {
		return this.isUsed;
	}
	
	public Hint getHint() {
		this.isUsed = true;
		return this;
	}
}
