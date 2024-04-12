package assignment1;

public class Icecream extends DesertShop {

	public Icecream(String flavour, int quantity, double price) {
		super(flavour, quantity, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calcutaleBill() {
		// TODO Auto-generated method stub
		return quantity * price;
	}

	@Override
	public String toString() {
		return super.toString() + "Icecream [calcutaleBill()=" + calcutaleBill() + "]";
	}
	

}
 