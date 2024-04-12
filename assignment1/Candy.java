package assignment1;

public class Candy extends DesertShop {
	
	protected double qtyinkg;
	

	public Candy(String flavour, int quantity, double price) {
		super(flavour, quantity, price);
		// TODO Auto-generated constructor stub
	}
    

	@Override
	public double calcutaleBill() {
		// TODO Auto-generated method stub
		qtyinkg = quantity * 0.001;
		return qtyinkg * price;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Candy [calcutaleBill()=" + calcutaleBill() + "]";
	}


}
