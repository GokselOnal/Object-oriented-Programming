package InheritanceAndPolymorphism;

public class Cleaning extends Product {
	private String brand;
	
	public Cleaning(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return super.toString() +"\n"+
				"Brand: " + this.brand;
	}
}
