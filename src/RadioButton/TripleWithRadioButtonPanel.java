package RadioButton;

import javax.swing.*;

public class TripleWithRadioButtonPanel extends JPanel{
	JLabel label = new JLabel("Hi.");
	JTextField text = new JTextField(15);
	JButton button1 = new JButton("Append");
	JButton button2 = new JButton("Reset");
    JRadioButton radio1 = new JRadioButton("lowercase");
	JRadioButton radio2 = new JRadioButton("UPPERCASE");
	ButtonGroup group = new ButtonGroup();

	public TripleWithRadioButtonPanel() {
		add(label);
		add(text);
		add(button1);
		add(button2);
		add(radio1);
		add(radio2);
		group.add(radio1);
	    group.add(radio2);

	    button1.addActionListener(new AppendListener(label,text));
	    text.addActionListener(new AppendListener(label,text));
	    
	    button2.addActionListener(new ResetListener(label,text));

	    radio1.addActionListener(new RadioListenerForLowerCase(text));
	    radio2.addActionListener(new RadioListenerForUpperCase(text));
	}
}
