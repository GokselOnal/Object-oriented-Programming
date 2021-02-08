package InheritanceAndPolymorphism;

public class Soap extends Cleaning {
	private int quantity;
	private boolean liquid;
	
	public Soap(String brand) {
		super(brand);
		this.liquid = false;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public boolean isLiquid() {
		return liquid;
	}

	public void setLiquid(boolean liquid) {
		this.liquid = liquid;
	}

	public String toString() {
		return super.toString() +"\n"+
				"Liquid: " + this.liquid +"\n"+
				"Quantity: " + this.quantity;
	}
}
