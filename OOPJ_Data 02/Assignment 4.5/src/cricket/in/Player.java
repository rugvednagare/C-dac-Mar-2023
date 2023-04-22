package cricket.in;
import java.util.Scanner;
public class Player {
	
	private String name;
	private int age;
	private String team;
	private int score;
	
	Player(){
		
	}
	public Player(String name, int age, String team, int score) {
		
		this.name = name;
		this.age = age;
		this.team = team;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	//Program program=new Program();
	
	public void play() {
		
	}
	
	static void getChoice( Player []prr ) {
		 Scanner sc=new Scanner(System.in);
		int choice = 0;
		
		do {
		System.out.println("0. Cricket Info");
		System.out.println("1. Football Info");
		System.out.println("2. Exit");
		choice=sc.nextInt();
		
		
			switch(choice) {
			case 0:  CricketPlayer cPlayer= (CricketPlayer) prr[choice];
			         cPlayer.acceptRecord();
			         cPlayer.play();
				break;
				
			case 1:  FootballPlayer fPlayer=(FootballPlayer) prr [choice];
			         fPlayer.acceptRecord();
			         fPlayer.play();
				break;
			}	
			}while(choice != 2);
	}
			
}

	

	
