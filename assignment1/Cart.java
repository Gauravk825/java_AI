package assignment1;

public class Cart {
	
	double totalBill = 0;
	int count = 0;
	
	public void addtocart(DesertShop ds) {
		
		totalBill += ds.calcutaleBill();
		count ++;
		
	}
	 
	public void showBill() {
		
		System.out.println("\n================================================================\n");
		System.out.println("Number of items : "+  count + "\tBill : " + totalBill);

	}
	public void resetBill() {
		totalBill = 0;
		count = 0;
		
	}

}
