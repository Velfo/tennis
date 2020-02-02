package igra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SetTest {

	@Test
	void testSetWinPlayer2() {
		Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
	
		
			
		assertEquals("5-7", match.set.retrnScore());
	}
	
	@Test
	void testSetWinPlayer1() {
		Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
	
		
			
		assertEquals("6-4", match.set.retrnScore());
	}
	
	@Test
	void testSetBreakPoint() {
		Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		
		assertEquals("6-7", match.set.retrnScore());
	}
	

}
