package Interface;
import java.util.ArrayList;

public class Apple extends Fruit implements TreeFruit {
	public Apple() {
		this.getColor();
		this.getVitamin();
	}
	
	@Override
	public void peel() {
		System.out.println("Peeling an apple.");
	}

	@Override
	public ArrayList<String> getVitamin() {
		ArrayList<String> vitamin = new ArrayList<>();
		vitamin.add("A");
		vitamin.add("B12");
		return vitamin;
	}

	@Override
	public String getColor() {
		return "green";
	}
}
