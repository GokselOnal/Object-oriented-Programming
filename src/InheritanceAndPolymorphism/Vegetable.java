package InheritanceAndPolymorphism;

public class Vegetable extends Food {
	
	public Vegetable(double taxRate,double kgs, boolean organic,String name) {
		super(taxRate,kgs);
		this.setName(name);
	}
}
