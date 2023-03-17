class Compound{
	public static void main (String args[])
	{
		int loan=50000000;
		int inv= 11560000;
		int n=5;
		double roi=10.75;
		double amount,ci;
		
	 amount= loan*((1+roi/100)*(1+roi/100)*(1+roi/100)*(1+roi/100)*(1+roi/100));
     ci= amount-loan;
		
		System.out.println("Loan Amount: " +loan);
		System.out.println("Own Investment: " +inv);
		System.out.println("No.of Years: " + n+"yrs");
		System.out.println("Rate of Interest: " +roi +"%");
		System.out.println("Compound Interest: "+ci );
		
		
	}
}