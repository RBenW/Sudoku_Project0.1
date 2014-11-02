//Ben Wagner

//Put name at top if you contributed^ 

public class EasyPuzzle extends Puzzle {

	private int numberHints = 5;
	private String difficulty = "Easy";
	private int timeLimit = 20;
	private int difficultyRating = 1;
	
	public EasyPuzzle() {
		super();
	}
	
	public EasyPuzzle(String filename) {
		super();
		this.board = importPlayBoard(filename);
	}
}
