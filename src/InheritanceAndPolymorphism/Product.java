package InheritanceAndPolymorphism;

public class Product {
	private double taxRate;
	private double price;
	private String name;

	public Product(double taxRate) {
		this.taxRate = taxRate;
		this.price = 1;
	}

	public Product() {
		this.taxRate = 18;
		this.price = 1;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return 	"Name: " + this.name +"\n"+
				"Tax rate: " + this.taxRate +"\n"+
				"Price: " + this.price;
	}
}
