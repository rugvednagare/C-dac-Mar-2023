package in.comparator.demo;
import java.util.Comparator;

public class NameComparator implements Comparator <Employee>{
	
	@Override
	public int compare(Employee a1, Employee a2) {
		
		return a1.getManager()- (a2.getManager());

	
	}
	

	
	
}
