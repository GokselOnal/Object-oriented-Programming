package InheritanceAndPolymorphism;

public class Meat extends Food {
	private String quality;
	
	public Meat(double taxRate, double kgs, String quality) {
		super(taxRate,kgs);
		this.quality = quality;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	public String toString() {
		return super.toString() +"\n"+
				"Quality: " + this.quality;
	}
}
