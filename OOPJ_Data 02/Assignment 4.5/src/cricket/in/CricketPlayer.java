package cricket.in;
import java.util.Scanner;

public class CricketPlayer extends Player {
	public static  Scanner sc=new Scanner(System.in);
	int runsScored;
	int wicketsTaken;
	
	CricketPlayer(){
		
		
	}
	public CricketPlayer(String name, int age, String team, int score, int runsScored, int wicketsTaken) {
		super(name, age, team, score);
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
	}

	void acceptRecord() {
		//CricketPlayer cPlayer=new CricketPlayer();
		
		System.out.println("Enter the Player Name  :");
		this.setName(sc.nextLine());
		System.out.println("Enter the Player Age  :");
		this.setAge(sc.nextInt());
		System.out.println("Enter the Player Team  :");
		sc.nextLine();
		this.setTeam(sc.nextLine());
		System.out.println("Enter the Player Score  :");
		this.setScore(sc.nextInt());
		System.out.println("Enter the runsscored   :");
	     this.runsScored=sc.nextInt();
	     System.out.println("Enter the wicketsTaken   :");
	     this.wicketsTaken=sc.nextInt();
		
	}
	
	public void play() {
		
	     
	     int Total_Score= runsScored + (wicketsTaken*10);
	     System.out.println("Total Score in Match   :"+Total_Score);
	     
	     System.out.println("Total Wickets in Match   :"+wicketsTaken);
	     
		
	}

}
