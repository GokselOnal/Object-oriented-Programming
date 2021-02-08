package RadioButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppendListener implements ActionListener{
	private JLabel label;
	private JTextField text;
	
	public AppendListener(JLabel label, JTextField text) {
		this.label = label;
		this.text = text;
	}
	
	public void actionPerformed(ActionEvent e) {
		label.setText(text.getText());
		text.setText("  ");
	}
}
