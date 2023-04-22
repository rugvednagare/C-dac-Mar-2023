package info.cdac;
import java.util.Scanner;

class Basic{
	String vehicleType;
	int numAxles;
	double distanceTravels;
	double tollFee;
	double totalAmountDue;
	
	

	public Basic(String vehicletype, int noofAxles, double distanceTravels,
			double tollFee, double totalAmountDue) {
		super();
		this.vehicleType = vehicletype;
		this.numAxles = noofAxles;
		this.distanceTravels = distanceTravels;
		this.totalAmountDue = totalAmountDue;
	}

	public Basic() {
		// TODO Auto-generated constructor stub
	}

	public String getVehicletype() {
		return vehicleType;
	}

	public void setVehicletype(String vehicletype) {
		this.vehicleType = vehicletype;
	}

	public int getNoofAxles() {
		return getNoofAxles();
	}

	public void setNoofAxles(int noofAxles) {
		numAxles = noofAxles;
	}

	public double getDistanceTravels() {
		return distanceTravels;
	}

	public void setDistanceTravels(double distanceTravels) {
		this.distanceTravels = distanceTravels;
	}
}
class Operation{
		TollBooth T1=new TollBooth();

	
	//public static void calculateTollFee() {
		//if (T1.setVehicletype == car)
	
	
		
		
}
public class TollBooth {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)throws Exception {
		Basic B1 = new Basic();
		Operation Op=new Operation();

		System.out.println("Enter type of vehicle	:");
		B1.setVehicletype(sc.nextLine());
		
		System.out.println("Enter Number of Axles	:");
		B1.setNoofAxles(sc.nextInt());
		
		System.out.println("Enter Distance Travel	:");
		B1.setDistanceTravels(sc.nextDouble());
		
		}
		
		
	}




