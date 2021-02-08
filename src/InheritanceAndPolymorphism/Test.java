package InheritanceAndPolymorphism;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();

		products.add(new Skirt(5, "M&S", "red", 20, "skirt"));
        products.get(0).setPrice(40);

        Vegetable pepper = new Vegetable(18, 0.5, false, "pepper");
        pepper.setKgs(10);
        products.add(pepper);

        DishWashing tablet = new DishWashing("C");
        tablet.setLts(30);
        tablet.setPrice(25);
        tablet.setLiquid(false);
        tablet.setName("tablet");
        products.add(tablet);

        Trousers jean = new Trousers(30, "blue", "B");
        jean.setName("jean");
        jean.setPrice(50.99);
        jean.setQuantity(10);
        products.add(jean);

        Dairy milk = new Dairy(25, 1, true, "milk");
        milk.setExpirationDate("2020-03-27");
        milk.setPrice(2.95);
        products.add(milk);

        Meat beef = new Meat(30,3,"Middle");
        beef.setPrice(75);
        beef.setExpirationDate("10.04.2017");
        beef.setName("beef");
        products.add(beef);
        
        Soap handSoap = new Soap("Avon");
        handSoap.setQuantity(5);
        handSoap.setName("hand soup");
        products.add(handSoap);

        double total = 0;
        total = calculateTotalPrice(products);
        receipt(products);
        System.out.println("      Total is " +total); 
	}

	public static double calculateTotalPrice(ArrayList<Product> products) {
		double res =0;
		for(int i = 0 ; i < products.size() ; i++) {
			double priceWithTaxRate = (products.get(i).getPrice() + (products.get(i).getPrice() * (products.get(i).getTaxRate()/100)));
			if(products.get(i) instanceof Cloth) {
				res += ((Cloth)products.get(i)).getQuantity() * priceWithTaxRate;
			}
			else if(products.get(i) instanceof Food) {
				res += ((Food)products.get(i)).getKgs() * priceWithTaxRate;
			}
			else if(products.get(i) instanceof Cleaning ) {
				if(products.get(i) instanceof Soap) {
					res += ((Soap)products.get(i)).getQuantity() * priceWithTaxRate;
				}
				else {
					res += ((Detergent)products.get(i)).getLts() * priceWithTaxRate;
				}
			}
		}
		return res;
	}

	public static void receipt(ArrayList<Product> products) {
		System.out.println("Purchased Cloth Items\n");
		for(int i= 0 ; i < products.size() ; i++) {
        	if(products.get(i) instanceof Cloth) {
        		System.out.println(products.get(i)+"\n");
        	}
        }
		System.out.println("------------------------------");
		System.out.println("Purchased Detergent Items\n");
        for(int i= 0 ; i < products.size() ; i++) {
        	if(products.get(i) instanceof Detergent) {
        		System.out.println(products.get(i)+"\n");
        	}
        }
		System.out.println("------------------------------");
		System.out.println("Purchased Soap Items\n");
        for(int i= 0 ; i < products.size() ; i++) {
        	if(products.get(i) instanceof Soap) {
        		System.out.println(products.get(i)+"\n");
        	}
        }
		System.out.println("------------------------------");
		System.out.println("Purchased Food Items\n");
        for(int i= 0 ; i < products.size() ; i++) {
        	if(products.get(i) instanceof Food) {
        		System.out.println(products.get(i)+"\n");
        	}
        }
		System.out.println("------------------------------");
	}
}
        
	

