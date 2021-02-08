package RadioButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioListenerForLowerCase implements ActionListener{
	private JTextField text;
	
	public RadioListenerForLowerCase (JTextField text) {
		this.text = text;
	}
	
	public void actionPerformed(ActionEvent e) {
		text.setText(text.getText().toLowerCase());
	}
}
