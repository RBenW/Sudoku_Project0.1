import java.io.IOException;

//Ben Wagner

//Put name at top if you contributed^ 

public class HardPuzzle extends Puzzle {

	private int numberHints = 3;
	private String difficulty = "Medium";
	private int timeLimit = 10;
	private int difficultyRating = 3;
	
	public HardPuzzle() throws IOException {
		super();
	}
	
	public HardPuzzle(String filename) throws IOException {
		super();
		this.board = importPlayBoard(filename);
	}
}
