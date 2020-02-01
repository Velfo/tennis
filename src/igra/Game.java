package igra;

public class Game {
	Player player1;
	Player player2;
	Player winner;
	Player loser;
	private Score score = new Score();

	/*
	 * Constructor to initalise a game with players 
	 */
	public Game(Player player1, Player player2, Score score) {
		this.player1 = player1;
		this.player2 = player2;
		this.score = score;
	}
	/*
	 * Player scores 
	 */
	public void playerScores(Player player) {
		this.score.playerScores(player);
	}
	/*
	 * Check the scrore 
	 */
	public Score getScore() {
		return score;
	}
	/*
	 * Set the score 
	 */
	public void setScore(Score score) {
		this.score = score;
	}
	
}
