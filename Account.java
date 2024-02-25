public class Account 
{
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;
    private final double minimumBalance = 1000; 

   
    public Account(String depositorName, int accountNumber, String accountType, double initialBalance) 
	{
        	this.depositorName = depositorName;
        	this.accountNumber = accountNumber;
        	this.accountType = accountType;
        	if (initialBalance >= minimumBalance) 
		{
            		this.balance = initialBalance;
        	} 
		else 
		{
            		System.out.println("Initial balance cannot be less than minimum balance of Rp " + minimumBalance);
            		this.balance = 0;
        	}
    	}

   
    	public void deposit(double amount) 
	{
        	if (amount > 0) 
		{
            		balance += amount;
            		System.out.println("Amount deposited successfully.");
        	} 
		else 
		{
            		System.out.println("Invalid deposit amount.");
        	}
    	}

    
    	public void displayAccountInfo() 
	{
        	System.out.println("Depositor Name: " + depositorName);
        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Account Type: " + accountType);
        	System.out.println("Balance: Rp " + balance);
    	}

    	public static void main(String[] args) 
	{
       
        	Account account = new Account("John Doe", 123456789, "Savings", 5000);

        
        	System.out.println("Initial Account Information:");
        	account.displayAccountInfo();

       
        	account.deposit(2000);

        
        	System.out.println("\nUpdated Account Information:");
        	account.displayAccountInfo();
    	}
}
