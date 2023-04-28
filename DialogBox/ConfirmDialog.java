package exam.Practise.DialogBox;

import java.awt.event.*;
import javax.swing.*;

public class ConfirmDialog extends JFrame implements WindowListener {
	
	ConfirmDialog() {
		addWindowListener(this);
		setVisible(true);
		setTitle("Confirm");
		setSize(400,400);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	
	public void windowClosing(WindowEvent e) {
		int a = JOptionPane.showConfirmDialog(this, "Are you sure you want to close?");
		if(a == JOptionPane.YES_OPTION) {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	// Other methods of the WindowListener interface
  public void windowOpened(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}

	public static void main(String[] args) {
		new ConfirmDialog();
	}
}
