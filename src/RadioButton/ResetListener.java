package RadioButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetListener implements ActionListener{
	private JLabel label;
	private JTextField text;

	public ResetListener(JLabel label , JTextField text) {
		this.label = label;
		this.text = text;
	}
	
	public void actionPerformed(ActionEvent e) {
		label.setText("Hi.");
		text.setText(" ");
	}
}
