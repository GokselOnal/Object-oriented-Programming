package InheritanceAndPolymorphism;

public class Cloth extends Product {
	private String brand;
	private String color;
	private int quantity;

	public Cloth(double taxRate, String color, String brand) {
		super(taxRate);
		this.color = color;
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//Prints
	public String toString() {
		return super.toString() +"\n"+
				"Brand: " + this.brand +"\n"+
				"Color: " + this.color + "\n"+
				"Quantity: " + this.quantity ;
	}
}
