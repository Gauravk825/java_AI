package assignment2;

public class Account {
	
	private int accno;
	private String name;
	private double bal;
	private static double minbal = 1000;
	private static double limit = 50000;
	
	public Account(int accno, String name, double bal) {
		this.accno = accno;
		this.name = name;
		this.bal = bal;
	
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	
	
	@Override
	public String toString() {
		return "Account [Account No. =" + accno + ", Name=" + name + ", Balance =" + bal + "]";
	}
	

	// withdrawl exception
	public double withdrawl(double amt) throws InsuffcientBalaceException{
		if(bal - amt < minbal) {
			throw new InsuffcientBalaceException("Withdrawl amount more than account balance");
		}
		return bal - amt;

	}
	
	
	// deposit exception
	public double deposit(double amt) throws LimitExceededException{
		if(amt > limit) {
			throw new LimitExceededException("Deposit Limit Exceeded. You can add upto Rs 50000.");
		}
		return bal + amt;
	}
	
	

}
