package exam.Practise.GUI.calculation;
import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class AddsubMouse extends JFrame{

AddsubMouse(){

	//JPanel jp = new JPanel();
	JLabel la = new JLabel("First Input");
	JTextField ta= new JTextField(10);
	JLabel ls = new JLabel("Second Input");
	JTextField ts = new JTextField(10);

	JButton ba = new JButton("MOUSE here");
ba.addMouseListener(new MouseAdapter() {
	public void mousePressed(MouseEvent e) {
		String a = ta.getText();
		String b = ts.getText();
		int res = Integer.valueOf(a)-Integer.valueOf(b);
		ba.setText("SUM: " + res);	
	}
});
	
ba.addMouseListener(new MouseAdapter() {
	public void mouseReleased(MouseEvent e) {
	String a = ta.getText();	
String b = ts.getText();
int d = Integer.valueOf(a)-Integer.valueOf(b);
ba.setText("Difference: " + d );
	}	
});
	
	
	setLayout(new FlowLayout());

	add(la);
	add(ta);
	add(ls);
add(ts);
add(ba);
		
	setVisible(true);
	setSize(600,200);
	setTitle("Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public static void main(String[] args) {
	
	new AddsubMouse();
//Mouse click on SUM Result 
	// Subtract on Mouse Release
	
}
}
