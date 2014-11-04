//Ben Wagner

//Put name at top if you contributed^ 

public class Player {
	private String name;
	private String gamerTag;
	private GameInstance gameInstance;
	//private PlayerHistory;
	
	public Player() {
		this.name = null;
		this.gamerTag = null;
		this.gameInstance = null;
	}
	
	public Player(String playerName, String playerGamerTag, int difficultyLevel) {
		this.name = playerName;
		this.gamerTag = playerGamerTag;
		this.gameInstance = new GameInstance(difficultyLevel, getFileName(difficultyLevel));
	}
	
	public GameInstance getGameInstance() {
		return this.gameInstance;
	}
	
	public String getFileName(int difficultyLevel) {//gets a file name to pull puzzle from
		return null;
	}
	
	public void useHint(int hintNumber){
		gameInstance.useHint(hintNumber);
	}
		
}
