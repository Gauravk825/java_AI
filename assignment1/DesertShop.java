package assignment1;

abstract public class DesertShop {
	
	protected String flavour;
	protected int quantity;
	protected double price;
	
	
	public DesertShop(String flavour, int quantity, double price) {
		super();
		this.flavour = flavour; 
		this.quantity = quantity;
		this.price = price;
	}

 
	@Override
	public String toString() {
		return "DesertShop [flavour=" + flavour + ", quantity=" + quantity + ", price=" + price + "]";
	}


	abstract double calcutaleBill();

}
