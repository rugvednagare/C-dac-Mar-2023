package in.comparator.demo;
import java.util.Comparator;

public class JobComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (o1.getJob().compareTo ( o2.getJob()));
			}
	
	

	
}
