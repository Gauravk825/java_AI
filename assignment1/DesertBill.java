package assignment1;

import java.util.Scanner;

 

public class DesertBill {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		
		int qty=0;
		String flav="";
		double prc=0.0;
	
		DesertShop ds;
		Cart c = new Cart();
		
		
		
		int choice = 0;
		//double bill = 0;
		while(choice != 4) {
			System.out.println("1. Candy \n2. Cookies \n3. Ice Cream \n4. Exit \nEnter choice : ");
			choice = sc.nextInt();

			if(choice < 4) {
			System.out.println("Enter flavour : "); 
			flav = sc.next();
			System.out.println("Enter quantity : ");
			qty = sc.nextInt();
			System.out.println("Enter price : ");
			prc = sc.nextDouble();
			}
			
			switch(choice) {
			
			case 1 :
					
				ds = new Candy(flav, qty, prc);
				c.addtocart(ds);
				break;
				
			case 2:

			
				ds = new Cookies(flav, qty, prc);
				c.addtocart(ds);
			
				break;
				
			case 3:
			
				ds = new Icecream(flav, qty, prc);
				c.addtocart(ds);
			
				break;
			
			case 4:
			System.out.println("Thankyou for visiting..");
			c.showBill();
			c.resetBill();
			break;
			
			default :
				System.out.println("Invalid choice");
				
			}// End of Switch
			
			
		}// end of while loop
	
	}

}
