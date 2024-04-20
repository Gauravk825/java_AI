package assignment3;


public class Account implements Comparable<Account>{
	
	int accno;
	String name;
	double bal;
	String ifsc;
	
	public Account(int accno, String name, double bal, String ifsc) {
		this.accno = accno;
		this.name = name;
		this.bal = bal;
		this.ifsc=ifsc;
	
	}

	@Override
	public String toString() {
		return "Account [Account No =" + accno + ", Name=" + name + ", Balance =" + bal + ", IFSC =" + ifsc + "]";
	}

	@Override
	public int compareTo(Account o) {
		// TODO Auto-generated method stub
		return this.accno - o.accno;
	}



	
	


}
