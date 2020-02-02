package igra;

public class Match {
	protected Set set;
	Player player1;
	Player player2;
	Player scoringPlayer;
	boolean gameFinished = false;

	/*
	 * Constructor to initialise match with players
	 */
	public Match(String player1Name, String player2Name) {
		this.player1 = new Player(1, player1Name);
		this.player2 = new Player(2, player2Name);
		this.set = new Set(player1, player2);
	}

	public void pointWonBy(Player player) {
		if (this.set.setFinished != true)
			this.set.setScoreFor(player);
		else {
			return;
		}

	}

	public void pointWonBy(String playerName) {

		if ("player 1".equals(playerName)) {
			this.scoringPlayer = this.player1;
		} else if ("player 2".equals(playerName)) {
			this.scoringPlayer = this.player2;
		}
		if (this.set.setFinished != true)
			this.set.setScoreFor(this.scoringPlayer);
		else {
			return;
		}

	}

	public void score() {
		// TODO Auto-generated method stub
//		this.set.returnScore();
		System.out.println(this.set.retrnScore());
		

	}
}
