package igra;

public class Player {
	private int playerNumber;
	/*
	 * Constructor to initalise player and their score 
	 */
	public Player(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	public int getPlayerNumber() {
		return playerNumber;
	}
	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

}
