package in.Cloneable;

public class Person implements Cloneable{
	
	String name;
	Address address;
	
	Person(){
		
		
	}
	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	public void clonedata() {
		
		
		
		
		
	
	    }

	
	public static void main(String[] args) {
		Address address=new Address();
		Person per = new Person("Rugved",new Address("Indiranagar","Nashik","Maharashtra"));
		
		try {
			Person per2= (Person)per.clone();
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		
		System.out.println(per.toString());
		
	
		
		

	}

}
