package cricket.in;
import java.util.Scanner;
public class FootballPlayer extends Player{
	
	int goalsScored ;
	int assists;
	
	FootballPlayer(){
	
	}
	
	public FootballPlayer(String name, int age, String team, int score, int goalsScored, int assists) {
		super(name, age, team, score);
		this.goalsScored = goalsScored;
		this.assists = assists;
	}	
	
	Scanner sc=new Scanner(System.in);
	
	public void acceptRecord() {
		
		//FootballPlayer fPlayer= new FootballPlayer();
		System.out.println("Enter the Player Name  :");
		this.setName(sc.nextLine());
		System.out.println("Enter the Player Age  :");
		this.setAge(sc.nextInt());
		System.out.println("Enter the Player Team Name  :");
		String team=sc.nextLine();
		this.setTeam(team);
		System.out.println("Enter the Player Goals  :");
		this.setScore(sc.nextInt());
				
		System.out.println("Enter the goalsScored   :");
	     this.goalsScored=sc.nextInt();
	     System.out.println("Enter the assists   :");
	     this.assists=sc.nextInt();
	     
	}
	
	public void play() {
		
	     System.out.println("Your Total Goals Scored  :"+goalsScored*assists);
		System.out.println("Total Assist "+assists);
		
		
	}
	

}
