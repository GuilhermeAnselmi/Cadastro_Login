package View;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login extends JFrame {
	private Container win;
	
	private JLabel lblTitle;
	private JLabel lblUsername;
	private JLabel lblPassword;
	
	private JTextField txtUsername;
	private JTextField txtPassword;
	
	private JButton btnRegister;
	private JButton btnLogin;
	private JButton btnExit;
	
	protected Login() {
		Init();
	}
	
	protected void Init() {
		win = getContentPane();
		win.setLayout(null);
		
		lblTitle = new JLabel("Login");
		lblTitle.setBounds(130, 10, 150, 20);
		
		lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(10, 40, 120, 20);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setBounds(10, 70, 120, 20);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(150, 40, 140, 20);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(150, 70, 140, 20);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register register = new Register();
				setVisible(false);
			}
		});
		btnRegister.setBounds(10, 120, 130, 20);
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Verify()) {
					System.out.println("Login");
				}
			}
		});
		btnLogin.setBounds(160, 120, 130, 20);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(80, 150, 120, 20);
		
		win.add(lblTitle);
		win.add(lblUsername);
		win.add(lblPassword);
		win.add(txtUsername);
		win.add(txtPassword);
		win.add(btnRegister);
		win.add(btnLogin);
		win.add(btnExit);
		
		setSize(300, 230);
		setVisible(true);
		setResizable(false);
	}
	
	protected boolean Verify() {
		String username = txtUsername.getText();
		String password = txtPassword.getText();
		if(username.equals("") || password.equals("")) {
			JOptionPane.showMessageDialog(null, "Incomplete fields", "Username and password fields not defined. Please complete them", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		
		username = username.replace(" ", "");
		password = password.replace(" ", "");
		
		return true;
	}
}
