package exam.Practise.GUI.calculation;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame{
CalculatorGUI(){
	//JPanel jp = new JPanel();
	JLabel la = new JLabel("First Input");
	JTextField ta= new JTextField(10);
	JLabel ls = new JLabel("Second Input");
	JTextField ts = new JTextField(10);

	JButton ba = new JButton("Addition");
	JButton bs = new JButton("Subtraction");

	ba.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent z) {
	String a = ta.getText();	
		String b = ts.getText();
		int res = Integer.valueOf(a)+Integer.valueOf(b);
		ba.setText("SUM = " + res);
	}
});
	bs.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent x) {
		String a = ta.getText();
		String b = ts.getText();
		int res = Integer.valueOf(a)-Integer.valueOf(b);
		bs.setText("Result = " + res);	
		}
	});
	
	
	setLayout(new FlowLayout());

	add(la);
	add(ta);
	add(ls);
add(ts);
add(ba);
	add(bs);	
	setVisible(true);
	setSize(600,200);
	setTitle("Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
	
	new CalculatorGUI();
	
	
}
}
