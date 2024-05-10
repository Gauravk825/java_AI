package day1;

public class Book {
	private String name;
	private String author;
	private int  price;
	private String genre; 
	
		
	//default
	public Book()
	{
		this("The Secret","Ronda bryn",1500,"motivational");
	}
	public Book(String name,String author,int price,String genre )
	{
		this.name=name;
		this.author=author;
		this.price=price;
		this.genre=genre;
		
	}

	public String toString() {
		
		return "NAME: "+ name +"\nAUTHOR  :"+ author +"\nPRICE :"+ price +"\nGENRE :"+ genre;
	
	}
}
