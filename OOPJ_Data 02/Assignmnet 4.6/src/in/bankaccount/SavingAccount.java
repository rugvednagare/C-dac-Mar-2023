package in.bankaccount;

public class SavingAccount extends Account{
	double interestRate;
	
	 
	public SavingAccount() {
		super( accountNumber,  balance);
		this.interestRate = 0.02 ;
		//double InterestAmount= this.interestRate * Account.getBalance();
		//System.out.println(" Your balance including Interest is  :"+InterestAmount+balance);
	}
	
	Account acc=new Account();
	
	
	public void calculateInterest() {
		
		double InterestAmount= this.interestRate * Account.getBalance();
		
		System.out.println(" Your balance including Interest is  :"+InterestAmount);
		
		System.out.println("1 . Deposite Money  :");
		System.out.println("1 . Withdraw Money  :");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1 :deposit();
		break;
		case 2: withdraw();
		break;
		}
		
		
		
	}
	

}
