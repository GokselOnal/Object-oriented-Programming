package InheritanceAndPolymorphism;

public class Food extends Product {
	private double kgs;
	private String expirationDate;
	
	public Food(double taxRate, double kgs){
		super(taxRate);
		this.kgs = kgs;
		this.expirationDate = "13.03.2017";
	}

	public double getKgs() {
		return kgs;
	}

	public void setKgs(double kgs) {
		this.kgs = kgs;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String toString() {
		return super.toString() +"\n"+
				"Kgs: " + this.kgs +"\n"+
				"Expiration date: " + this.expirationDate;
	}
}
