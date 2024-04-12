package assignment1;

public class Cookies extends DesertShop {
	
	
	protected double newprice;

	public Cookies(String flavour, int quantity, double price) {
		super(flavour, quantity, price);
		
	}
 
	@Override
	double calcutaleBill() {
		
		newprice = price /12;
		
		return newprice * quantity;
	}

	@Override
	public String toString() {
		return super.toString() + "Cookies [calcutaleBill()=" + calcutaleBill() + "]";
	}

}
