package View;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Register extends JFrame {
	private Container win;
	
	private JLabel lblTitle;
	private JLabel lblUsername;
	private JLabel lblPassword;
	
	private JTextField txtUsername;
	private JTextField txtPassword;
	
	private JButton btnRegister;
	private JButton btnLogin;
	private JButton btnExit;
	
	protected Register() {
		Init();
	}
	
	protected void Init() {
		win = getContentPane();
		win.setLayout(null);
		
		setSize(300, 230);
		setVisible(true);
		setResizable(false);
	}
}
