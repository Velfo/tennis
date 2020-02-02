package igra;


public class Set {
	Player player1;
	Player player2;
	private Score score;
	// current game that is being played
	Game currentGame;
	boolean finished = false;
	boolean currentGamefinished = false;
	boolean setFinished = false;
	int gameNumber = 1;
	/*
	 * Indicating the number of games won by each player
	 * The index 0 of the array indicates the wins of the first player 
	 * The index 1 of the array indicates the wins of the second player 
	 */	
	private int [] gamesWon = {0,0};
	
	/*
	 * Constructor to initalise a game with players 
	 */
	public Set(Player player1, Player player2) {
		this.score = new  Score();
		this.player1 = player1;
		this.player2 = player2;
		this.currentGame = new Game(player1, player2, score);
	}
		
	
	/*
	 * Set the current game 
	 */
	public void setNewGame() {
		this.score = new  Score();
		this.currentGame = new Game (player1, player2, this.score);
		this.gameNumber += 1;
	}		
	
	/*
	 * Returns the games score  
	 */
	public int [] getGamesWon() {
		return gamesWon;
	}
	/*
	 * Call this function when a player wins a game 
	 */	
	public void setGamesWon(Player player) {
		switch (player.getPlayerNumber()) {
		case 1:
			this.gamesWon[0] += 1;
			break;
		case 2:
			this.gamesWon[1] += 1;
			break;
		}
	}


	public void setScoreFor(Player player) {
		System.out.println("Game number " +this.gameNumber);
		if(this.setFinished == true)
		{
			System.out.println("Set finished");
			return;
		}	
		if(this.score.gameFinished == false)
			this.currentGame.playerScores(player);
		else {
			this.setNewGame();
		}
	}
	
	public boolean gameFinished() {
		
		return finished;
	}
	
    public Score getScore() {
		return this.score;
	}


//	public int[][] returnScore() {
//		// TODO Auto-generated method stub
//		int [][] result = new int [2][];
//		
//		result[0] = gamesWon;
//		result[1] = score.getoverallGameScore();
//		
//		return result;
//	}
	
	public void returnScore() {
		// TODO Auto-generated method stub
//		this.score.determineGameScore();
	}	
	
}
