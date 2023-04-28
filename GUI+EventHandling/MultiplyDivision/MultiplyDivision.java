package exam.Practise.GUI.calculation;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MultiplyDivision extends JFrame{
	MultiplyDivision(){
		JLabel f = new JLabel("Enter first number: ");
		JTextField tf = new JTextField(5);
		JLabel s = new JLabel("Enter second number: ");
		JTextField ts = new JTextField(5);	
		
		JButton bm = new JButton("Multiply");
		JButton bd = new JButton("Divide");
		
		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
			String a = tf.getText();
			String b = ts.getText();
			int r = Integer.valueOf(a)*Integer.valueOf(b);
			bm.setText("Result: " + r);
			}	});
		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent c) {
				String a = tf.getText();
				String b = ts.getText();
				int r = Integer.valueOf(a)/Integer.valueOf(b);
				bd.setText("Result: " + r);
				}
		});
		
		
		setLayout(new FlowLayout());
		
		add(f); add(tf); add(s); add(ts); add(bm); add(bd);
		setVisible(true);
	setSize(600,200);
	setTitle("Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
	new MultiplyDivision();
	}
}
