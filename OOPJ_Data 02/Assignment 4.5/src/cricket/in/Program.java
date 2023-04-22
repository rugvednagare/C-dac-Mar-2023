package cricket.in;

public class Program {
	
	Player pplayer= new Player();
	static Player []prr= new Player[5];
	
	  public static  Player[] arrayData()	{
		
		int size=5;
		
		prr[0]=new CricketPlayer();
		prr[1]=new FootballPlayer();
		
		return prr;
		
		
		
	}	

	public static void main(String[] args) throws Exception{
		Player[] p = arrayData();
		Player.getChoice(prr);
		
		
			
		}
		
		
	}


