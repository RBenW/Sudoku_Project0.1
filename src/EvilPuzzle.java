import java.io.IOException;

//Ben Wagner

//Put name at top if you contributed^ 

public class EvilPuzzle extends Puzzle {

	private int numberHints = 3;
	private String difficulty = "Evil";
	private int timeLimit = 10;
	private int difficultyRating = 4;
	
	public EvilPuzzle() throws IOException {
		super();
	}
	
	public EvilPuzzle(String filename) throws IOException {
		super();
		this.board = importPlayBoard(filename);
	}
}
