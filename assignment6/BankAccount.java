package assignment6;


public class BankAccount {
	
	double bal;
	public BankAccount(double bal) {
		this.bal = bal;
	
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	
	
	public void withdrawl(double amt) {
		if(this.bal < amt) {
			try {
				System.out.println("Insuffient Balance ");
				System.out.println("Waiting for Deposit ");
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		this.bal = this.bal-amt;
		notify();

	}
	
	
	public void deposit(double amt) {
		this.bal = this.bal + amt;
		notify();
		
	}
	


}
