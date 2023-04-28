import javax.swing.*;
import java.awt.*;
public class Main extends JFrame{
	private JPanel jp ;
	private JLabel nameL, passL, Repass;
	private JTextField nameT;
	private JPasswordField passO, passR;
	private JButton jb1;
	
	
	Main(){
		setVisible(true);
		setSize(300,300);
		setTitle("Simple Fillup Form");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.InternalCom();
	}
	
	public void InternalCom() {
		jp = new JPanel();
		
		nameL = new JLabel ("Username");
		passL = new JLabel ("Password");
		Repass = new JLabel ("Retype Password");
		
		nameT = new JTextField(30);
		passO = new JPasswordField(30);
		passR = new JPasswordField(30);

		jb1 = new JButton("Submit");
		
		jp.add(nameL);
		jp.add(nameT);
		jp.add(passL);
		jp.add(passO);
		jp.add(Repass);
		jp.add(passR);
		jp.add(jb1);
		
	jp.setLayout(new GridLayout(8,1)); 
	//(8,1) changed accordingly to customize the display components 
	this.add(jp);
	
	}
	
public static void main(String[] args) {
System.out.println("Running...");
	new Main();
	
	
}
}
