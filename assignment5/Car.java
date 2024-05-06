package assignment5;

public class Car {
	
	private String model;
	private String colour;
	private int stock;
	private double price;
	private int manyear;
	
	public Car(String model, String colour, int stock, double price, int manyear) {
		this.model = model;
		this.colour = colour;
		this.stock = stock;
		this.price = price;
		this.manyear = manyear;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getManyear() {
		return manyear;
	}

	public void setManyear(int manyear) {
		this.manyear = manyear;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", colour=" + colour + ", stock=" + stock + ", price=" + price + ", manyear="
				+ manyear + "]";
	}
	
	
	
	

}
