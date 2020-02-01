package igra;

public class Score {
	private int player1Result;
	private int player2Result;
	private int[] overallGameScore = {0,0};
	/*
	 * Player scores, the score changes 
	 */
	public void playerScores(Player player) {
		switch(player.getPlayerNumber()) {
		  case 1:
			  this.setPlayer1Result();
		  case 2:
			  this.setPlayer2Result();	
		}
		this.setOverallScore();
	}
	/*
	 * Setter and getter for player1 result 
	 */
	public int getPlayer1Result() {
		return this.player1Result;
	}
	public void setPlayer1Result() {
		this.player1Result = this.player1Result + 15;
	}
	/*
	 * Setter and getter for player2 result 
	 */
	public int getPlayer2Result() {
		return this.player2Result;
	}
	public void setPlayer2Result() {
		this.player2Result = this.player2Result + 15;
	}
	/*
	 * Set the overall score 
	 */
	public void setOverallScore() {
		this.overallGameScore[0] = this.player1Result;
		this.overallGameScore[1] = this.player2Result;
	}
	/*
	 * Get the overall score 
	 */
	public int[] getOverallScore() {
		return this.overallGameScore;
	}

}
