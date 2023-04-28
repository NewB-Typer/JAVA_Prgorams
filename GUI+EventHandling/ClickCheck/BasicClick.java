package exam.Practise.GUI.calculation;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
//Basic Click on EAST and WEST
public class BasicClick extends JFrame{
	BasicClick(){
		JButton jb1 , jb2;
		jb1 = new JButton("EAST");
		jb2 = new JButton("WEST");
		
		add(jb1,BorderLayout.EAST);
		add(jb2,BorderLayout.WEST);
		
		jb1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.out.println("EAST was clicked.");
		}
			
		});
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed( ActionEvent e) {
			System.out.println("WEST was clicked");	
			}
		});
		
		
		
		setVisible(true);
	setSize(200,200);
	setTitle("Calculator");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new BasicClick();	
}
}
