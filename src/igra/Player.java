package igra;

public class Player {
	private int playerNumber;
	private String playerName;

	/*
	 * Constructor to initialise player and their score
	 */
	public Player(int playerNumber, String playerName) {
		this.playerNumber = playerNumber;
		this.playerName = playerName;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

}
