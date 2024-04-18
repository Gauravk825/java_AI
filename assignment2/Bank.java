package assignment2;

public class Bank {
	
	public static void main(String[] args) {
		//class object 
		Account a1 = new Account(101, "Gaurav", 5000);
		Account a2 = new Account(102, "Mitali", 5000);

		// try block for withdrawal
		try {
			double bal  = a2.withdrawl(2000);
			System.out.println("Balance : " +bal);

		}
		catch(InsuffcientBalaceException e){
			System.out.println(e);
		}
	
		// try block for deposit
		try {
			double bal = a1.deposit(70000);
			System.out.println("Balance : " +bal);
			
		}
		catch (LimitExceededException e){
			System.out.println(e);
			
		}

	}

}
