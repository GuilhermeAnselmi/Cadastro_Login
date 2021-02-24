package View;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Window {
	private Container win;
	
	private JLabel lblTitle;
	private JLabel lblUsername;
	private JLabel lblPassword;
	
	private JTextField txtUsername;
	private JTextField txtPassword;
	
	private JButton btnRegister;
	private JButton btnLogin;
	private JButton btnExit;
	
	protected Window() {
		Init();
	}
	
	protected void Init() {
		
	}
}
