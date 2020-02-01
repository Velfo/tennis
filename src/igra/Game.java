package igra;

public class Game {
	Player player1;
	Player player2;
	Player winner;
	Player loser;
	private Score score;
	private String advantage;

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
	 * Check the score 
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
	/*
	 * Set and get the advantage attribute
	 */
	public String getAdvantage() {
		return advantage;
	}
	public void setAdvantage(String advantage) {
		this.advantage = advantage;
	}
	
}
