package igra;

public class Score {
	private int player1Result = 0;
	private int player2Result = 0;
	private int[] overallGameScore = {0,0};
	/*
	 * Player scores, the score changes 
	 */
	public void playerScores(Player player) {
		switch(player.getPlayerNumber()) {
		  case 1:
			  this.setPlayer1Result();
			  break;
		  case 2:
			  this.setPlayer2Result();	
			  break;
		}
		System.out.println(this.getPlayer2Result());
		this.setOverallGameScore();
	}
	/*
	 * Setter and getter for player1 result 
	 */
	public int getPlayer1Result() {
		return this.player1Result;
	}
	public void setPlayer1Result() {
		System.out.println(this.player1Result);
		this.player1Result = this.player1Result + 15;
	}
	/*
	 * Setter and getter for player2 result 
	 */
	public int getPlayer2Result() {
		return this.player2Result;
	}
	public void setPlayer2Result() {
		this.player2Result =this.player2Result + 15;
	}
	/*
	 * Set the overall score 
	 */
	public void setOverallGameScore() {
		this.overallGameScore[0] = this.player1Result;
		this.overallGameScore[1] = this.player2Result;
	}
	/*
	 * Get the overall score 
	 */
	public int[] getoverallGameScore() {
		return this.overallGameScore;
	}

}
