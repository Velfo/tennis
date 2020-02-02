package igra;

import java.util.Arrays;
import java.util.List;

public class Score {
	private int player1Result = 0;
	private int player2Result = 0;
	private int[] overallGameScore = {0,0};
	private int[] possileGameScores = {0,15,30,40};
	boolean gameFinished = false;
	private int gameWinner = 0;
	private int player1ValueRes;
	private int player2ValueRes; 
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
			
		determineGameScore();
	}
	/*
	 * Determine game score 
	 */
	public boolean determineGameScore() {
		int player1Res = getPlayer1Result();
		int player2Res = getPlayer2Result();
		boolean player1ScoreInArray = true;
		boolean player2ScoreInArray = true;
		
		if (player1Res > 3 || player2Res > 3) {
			if (player1Res - player2Res > 1) {
				System.out.println("Player 1 won");
				this.setGameWinner(1);
				gameFinished = true;
				return true;
			}
			else if (player1Res - player2Res < -1) {
				System.out.println("Player 2 won");
				this.setGameWinner(2);
				gameFinished = true;
				return true;
			}
		
		}else {
			this.player1ValueRes = possileGameScores[player1Res];
			this.player2ValueRes = possileGameScores[player2Res];
		}
		
		return false;		
	}
	/*
	 * Utility method to check if array contains an integer 
	 */
	
	   public static boolean contains(final int[] array, final int v) {
	
	        boolean result = false;
	
	        for(int i : array){
	            if(i == v){
	                result = true;
	                break;
	            }
	        }
	
	        return result;
	    }
	
	/*
	 * Setter and getter for player1 result 
	 */
	public int getPlayer1Result() {
//		if(player1Result<4)
//			return this.possileGameScores[player1Result];
//		else
			return player1Result;
	}
	public void setPlayer1Result() {
		this.player1Result = this.player1Result + 1;
	}
	/*
	 * Setter and getter for player2 result 
	 */
	public int getPlayer2Result() {
//		if(player2Result<4)
//			return this.possileGameScores[player2Result];
//		else
			return player2Result;
	}
	public void setPlayer2Result() {
		this.player2Result =this.player2Result + 1;
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
	public int getGameWinner() {
		return gameWinner;
	}
	public void setGameWinner(int gameWinner) {
		this.gameWinner = gameWinner;
	}
	public int getPlayer1ValueRes() {
		return player1ValueRes;
	}
	public void setPlayer1ValueRes(int player1ValueRes) {
		this.player1ValueRes = player1ValueRes;
	}
	public int getPlayer2ValueRes() {
		return player2ValueRes;
	}
	public void setPlayer2ValueRes(int player2ValueRes) {
		this.player2ValueRes = player2ValueRes;
	}

}
