package day1;

public class Car {
	
	private String make;
	private String model;
	private double price;
	private int man_year;
	private static int count=0;
	
		
	//default
	public Car()
	{
		this("Honda","city",1500000,2020);
	}
	public Car(String make,String model,double price,int man_year )
	{
		count++;
		this.make=make;
		this.model=model;
		this.price=price;
		this.man_year=man_year;
		
	}

	public String toString() {
		
		return "make: "+make+"\nModel :"+model+"\nprice :"+price+"\nManufacturing year :"+man_year+"\nThe total cars are :"+count;
	}
	public void displaycount()
	{
		System.out.println("Total cars : "+ count);
	}
}
