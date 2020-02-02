package igra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testGame() {
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		Score score = new Score();
		
		Game game = new Game(player1, player2, score);
		
		game.playerScores(player2);
		game.playerScores(player1);
		game.playerScores(player1);
		game.playerScores(player1);
		int result2 = score.getPlayer2Result();
		int result1 = score.getPlayer1Result();
		
		assertEquals(15, result2);
		assertEquals(45, result1);
	}

}
