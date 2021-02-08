package Interface;
import java.util.ArrayList;

public class Banana extends Fruit implements TreeFruit {
	public Banana() {
		this.getColor();
		this.getVitamin();
	}

	@Override
	public void peel() {
		System.out.println("Peeling a banana.");
	}

	@Override
	public ArrayList<String> getVitamin() {
		ArrayList<String> vitamin = new ArrayList<String>();
		vitamin.add("C");
		vitamin.add("D");
		return vitamin;
	}

	@Override
	public String getColor() {
		return "yelow";
	}
}
