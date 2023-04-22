
public class Operation {
	int index; 
	String food;
	double Rate;

	public Operation(int index, String food, double rate) {
		super();
		this.index = index;
		this.food = food;
		Rate = rate;
	}
	public int getIndex() {
		return index;
	}
	@Override
	public String toString() {
		return "Operation [index=" + index + ", food=" + food + ", Rate=" + Rate + "]";
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public double getRate() {
		return Rate;
	}
	public void setRate(double rate) {
		Rate = rate;
	}
	
}
