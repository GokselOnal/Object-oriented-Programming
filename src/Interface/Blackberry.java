package Interface;
import java.util.ArrayList;

public class Blackberry extends Fruit implements GroundFruit {
	public Blackberry(){
		this.getColor();
		this.getVitamin();
	}

	@Override
	public void pick() {
		System.out.println("Picking a blackberry.");
	}

	@Override
	public ArrayList<String> getVitamin() {
		ArrayList<String> vitamin = new ArrayList<String>();
		vitamin.add("C");
		vitamin.add("K");
		return vitamin;
	}

	@Override
	public String getColor() {
		return "black";
	}
}
