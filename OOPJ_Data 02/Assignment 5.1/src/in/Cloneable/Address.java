package in.Cloneable;

public class Address {
	
	String street;
	String city;
	String state;
	
	Address(){
		
	}
	
	Address(String street,String city,String state){
		this.street=street;
		this.city= city;
		this.state = state;
		
	
			
		try {
			Address add = new Address("Indiranagar","Nashik","Maharashtra");
			Address add2 = (Address)add.clone();
			}
		catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
}
}

		
	    
	
	
	

