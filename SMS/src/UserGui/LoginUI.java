package UserGui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class LoginUI extends JFrame  {
	private JTextField textField;
	private JPasswordField passwordField;
	
	
	public LoginUI() {
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblUserid = new JLabel("  UserID : ");
		lblUserid.setBounds(42, 70, 55, 20);
		panel.add(lblUserid);
		
		textField = new JTextField();
		textField.setBounds(115, 70, 179, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password : ");
		lblPassword.setBounds(42, 138, 65, 14);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(115, 135, 179, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(38, 209, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBounds(169, 209, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(305, 209, 89, 23);
		panel.add(btnNewButton_2);
	}
}
