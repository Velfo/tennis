package igra;

public class Set {
	protected Player player1;
	protected Player player2;
	private Score score;
	// current game that is being played
	protected Game currentGame;
	protected boolean finished = false;
	protected boolean currentGamefinished = false;
	protected boolean setFinished = false;
	protected boolean playTieBreak = false;
	protected int gameNumber = 1;
	protected int setWinner = 0;
	protected int gamesWonDifference = 0;
	protected String advantage = "";
	/*
	 * Indicating the number of games won by each player The index 0 of the array
	 * indicates the wins of the first player The index 1 of the array indicates the
	 * wins of the second player
	 */
	private int[] gamesWon = { 0, 0 };

	/*
	 * Constructor to initalise a game with players
	 */
	public Set(Player player1, Player player2) {
		this.score = new Score();
		this.player1 = player1;
		this.player2 = player2;
		this.currentGame = new Game(player1, player2, score);
	}

	/*
	 * Set the current game
	 */
	public void setNewGame() {
		this.score = new Score();
		this.currentGame = new Game(player1, player2, this.score);
		this.gameNumber += 1;
	}

	/*
	 * Returns the games score
	 */
	public int[] getGamesWon() {
		return gamesWon;
	}

	/*
	 * Check who won the set
	 */
	public void checkSetWinner() {

		// Tie-break won situation
		if (gamesWon[0] > 6 || gamesWon[1] > 6) {
			this.setFinished = true;
		}

		if (gamesWon[0] > 5 || gamesWon[1] > 5) {
			this.gamesWonDifference = gamesWon[0] - gamesWon[1];

			// The overall set score is 6-6. So, play tie-break
			if (this.gamesWonDifference == 0) {
				this.playTieBreak = true;
			}
			// Winning scenarios
			if (this.gamesWonDifference > 1) {
				// player 1 won the set
				this.setWinner = 1;
				this.setFinished = true;
			} else if (this.gamesWonDifference < -1) {
				// player 2 won the set
				this.setWinner = 2;
				this.setFinished = true;
			}

		}
	}

	/*
	 * Set the player scores as the game goes on
	 */
	public void setScoreFor(Player player) {
		this.checkSetWinner();
		if (this.setFinished == true) {
			return;
		}
		if (this.score.gameFinished == false) {
			// Play tie-break
			if (this.playTieBreak == true) {
				this.currentGame.playTieBreak(player);
			} else {
				this.currentGame.playerScores(player);
			}
		} else {
			int gameWinner = this.score.getGameWinner();
			if (gameWinner == 1) {
				this.gamesWon[0]++;
			} else if (gameWinner == 2) {
				this.gamesWon[1]++;
			}
			this.setNewGame();
			this.setScoreFor(player);
		}

	}

	public boolean gameFinished() {

		return finished;
	}

	public Score getScore() {
		return this.score;
	}

	/*
	 * Displaying possible scores
	 */
	public void returnScore() {

		// Set finished situation
		this.checkSetWinner();
		if (this.setFinished == true) {
			System.out.println(this.gamesWon[0] + "-" + this.gamesWon[1]);
			return;
		}

		// Player wins situation
		int gameWinner = this.score.getGameWinner();
		if (gameWinner != 0) {
			if (gameWinner == 1) {
				this.gamesWon[0]++;
			} else if (gameWinner == 2) {
				this.gamesWon[1]++;
			}
			System.out.println(this.gamesWon[0] + "-" + this.gamesWon[1]);
			// Tie-break won situation

			return;
		}

		// Advantage situation
		if (this.score.advantage != 0) {
			if (this.score.advantage == 1) {
				this.advantage = "Advantage player 1";
			} else if (this.score.advantage == 2) {
				this.advantage = "Advantage player 2";
			}
			System.out.println(this.gamesWon[0] + "-" + this.gamesWon[1] + ", " + this.advantage);
			return;
		}
		// No advantage situation
		if (this.score.deus != true && this.score.advantage == 0) {
			System.out.println(this.gamesWon[0] + "-" + this.gamesWon[1] + ", " + this.score.getPlayer1ValueRes() + "-"
					+ this.score.getPlayer2ValueRes());
		} else {
			System.out.println(this.gamesWon[0] + "-" + this.gamesWon[1] + ", Deuce");
		}

	}

}
