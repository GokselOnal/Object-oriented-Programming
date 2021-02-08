package RadioButton;
import javax.swing.*;

public class TripleWithRadioButtons {
	public static void main(String[] args) {
		JFrame app = new JFrame();
		app.add(new TripleWithRadioButtonPanel());
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setSize(200,200);
		app.setLocationRelativeTo(null);
		app.setVisible(true);
	}
}
