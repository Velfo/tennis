package igra;

public class Oyna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		Score score = new Score();
		
		Game game = new Game(player1, player2, score);
		
		game.playerScores(player2);
		game.playerScores(player1);
		game.playerScores(player1);
//		game.playerScores(player1);
		System.out.println("Player 2 "+score.getPlayer2Result());
		System.out.println("Player 1 "+score.getPlayer1Result());
		
	}

}
