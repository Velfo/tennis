package igra;

public class Oyna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		
		 Match match = new Match(player1, player2);
		 
		
		  match.pointWonBy(player1);
		  match.pointWonBy(player2);
		  // this will return "0-0, 15-15"
		  match.score();
		  
		  match.pointWonBy(player1);
		  match.pointWonBy(player1);
		  match.score();
		  
		  match.pointWonBy(player2);
		  match.pointWonBy(player2);
		  match.score();
		  
		  match.pointWonBy(player1);
		  match.pointWonBy(player1);
		  match.score();
	}

}
