package igra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class OutcomeTest {

	@Test
	void testDeuce() {
		Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");

		assertEquals("0-0, Deuce", match.set.retrnScore());
	}

	@Test
	void testAdvantagePlayer1() {
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

		assertEquals("0-0, Advantage player 1", match.set.retrnScore());
	}

	@Test
	void testAdvantagePlayer2() {
		Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");

		assertEquals("0-0, Advantage player 2", match.set.retrnScore());
	}

	@Test
	void testOneNilToPlayer1() {
		Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 1");

		assertEquals("1-0", match.set.retrnScore());
	}

	@Test
	void testOneNilToPlayer2() {
		Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");
		match.pointWonBy("player 2");

		assertEquals("0-1", match.set.retrnScore());
	}

}
