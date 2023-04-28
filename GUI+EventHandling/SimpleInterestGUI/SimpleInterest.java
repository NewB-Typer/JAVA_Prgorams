package exam.Practise.GUI.calculation;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SimpleInterest extends JFrame{
SimpleInterest(){
JLabel p = new JLabel("Principal:");
JTextField tp = new JTextField(10);

JLabel t = new JLabel("Time:");
JTextField tt = new JTextField(10);
t.setToolTipText("Enter in years!!");


JLabel r = new JLabel("Rate of interest:");
JTextField tr = new JTextField(10);

JButton jb = new JButton("Simple Interest" );

jb.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent c) {
		String p = tp.getText();
		String t = tt.getText();
		String r = tr.getText();
	int	I = (Integer.valueOf(p)*Integer.valueOf(t)*Integer.valueOf(r))/100;
	jb.setText("SI = " + I);
	}
	
	
});

setLayout(new FlowLayout());
	
	add(p); add(tp); add(t); add(tt); add(r); add(tr); add(jb);
	
	setVisible(true);
	setSize(600,200);
	setTitle("Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
	new SimpleInterest();
	}	
}

