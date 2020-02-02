# tennis

Tennis is a tennis scores program. Two players score points and according to the number of points the outcome of the game is 
determined.The game will only have one set but it can go up to a tie-break (like in real tennis matches) if the overall score  reaches 6-6. 

Architecture

A match consists of a set that has many games. So [Match] -> [Set] -> [Games] -> [Scores]
Oyna.java is the main class from where the program is initiated.
To start the game just create a new Match object and pass two players into it.
After the Match object is created we can start playing like so:

	Match match = new Match("player 1", "player 2");

		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 1");
		match.pointWonBy("player 2");  

Tests

OutcomeTest.java - These tests the results of different outcomes within a set. These are short tests.
SetTest.java - These tests take into account wider scenarios within a set. For example they test the break-point scenario These are longer tests.

 