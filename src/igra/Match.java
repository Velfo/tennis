package igra;

public class Match {
	Set set;
	Player player1;
	Player player2;
	boolean gameFinished = false;

	/*
	 * Constructor to initalise match with players
	 */
	public Match(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.set = new Set(player1, player2);
	}

	public void pointWonBy(Player player) {
		if (this.set.setFinished != true)
			this.set.setScoreFor(player);
		else {
			return;
		}

	}

	public void score() {
		// TODO Auto-generated method stub
		this.set.returnScore();

	}
}
