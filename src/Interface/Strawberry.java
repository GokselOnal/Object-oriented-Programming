package Interface;
import java.util.ArrayList;

public class Strawberry extends Fruit implements GroundFruit {
	public Strawberry() {
		this.getColor();
		this.getVitamin();
	}

	@Override
	public void pick() {
		System.out.println("Picking a strawberry.");
	}

	@Override
	public ArrayList<String> getVitamin() {
		ArrayList<String> vitamin = new ArrayList<String>();
		vitamin.add("B5");
		vitamin.add("E");
		return vitamin;
	}

	@Override
	public String getColor() {
		return "red";
	}
}
