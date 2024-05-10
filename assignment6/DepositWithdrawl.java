package assignment6;

public class DepositWithdrawl {
	
public static void main(String[] args) {
		
	BankAccount sb = new BankAccount(10);
	Thread withdrawl = new Thread((new Runnable() {
			@Override
			public void run() {
				synchronized(sb) {
						sb.withdrawl(500);
						System.out.println("Withdrawl Complete. ");
						System.out.println("Balance : "+ sb.getBal());
							
						}
					} 
	 }));

	
	
	
	Thread deposite = new Thread(new Runnable() {
		@Override
		public void run() {
			synchronized(sb) {
				sb.deposit(1000);
				System.out.println("Deposit Complete");
				System.out.println("After Deposit" + sb.getBal());
					} 
				}
			});
	withdrawl.start();
	deposite.start();

	}

}

