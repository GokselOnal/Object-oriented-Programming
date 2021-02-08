package InheritanceAndPolymorphism;

public class Detergent extends Cleaning{
	private double lts;
	private boolean liquid;
	
	public Detergent(String brand) {
		super(brand);
		this.liquid = true; 
	}

	public double getLts() {
		return lts;
	}

	public void setLts(double lts) {
		this.lts = lts;
	}

	public boolean isLiquid() {
		return liquid;
	}

	public void setLiquid(boolean liquid) {
		this.liquid = liquid;
	}

	public String toString() {
		return super.toString() +"\n"+
				"Lts: " + this.lts +"\n"+
				"Liquid: " + this.liquid;
	}
}
