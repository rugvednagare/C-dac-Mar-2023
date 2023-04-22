package in.bankaccount;

public class CheckingAccount extends Account{
	
	double overdraftLimit;

	CheckingAccount(){
		
	}
	
	public CheckingAccount(double overdraftLimit) {
		super(accountNumber,  balance);
		this.overdraftLimit = 500.0;
	}
	
	Account acc=new Account();
	
	protected void withdrawAmount() {
		if (Account.balance < overdraftLimit) {
			
			double Ammount_After_Fine= Account.balance-overdraftLimit;
			System.out.println("OverDraft Limit fine Applicable, Remained Ammount  :"+Ammount_After_Fine);
		
		}else
			
		{
			System.out.println(" Balance is Maintained & Total Balance is  :"+Account.balance);
		}
		
		System.out.println("1 . Deposite Money  :");
		System.out.println("2 . Withdraw Money  :");
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
