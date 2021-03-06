package User;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class ChangePass extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePass frame = new ChangePass();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChangePass() {
		setType(Type.UTILITY);
		setTitle("Change Pawword");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel OldPassword = new JLabel("Old Password:");
		OldPassword.setBounds(27, 30, 70, 14);
		panel.add(OldPassword);
		
		JLabel NewPassword = new JLabel("New Password:");
		NewPassword.setBounds(27, 71, 90, 14);
		panel.add(NewPassword);
		
		JLabel RetryPass = new JLabel("Retry New Password:");
		RetryPass.setBounds(27, 114, 106, 14);
		panel.add(RetryPass);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 27, 157, 20);
		panel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(168, 68, 157, 20);
		panel.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(168, 111, 157, 20);
		panel.add(passwordField_2);
		
		JButton btnChangePassword = new JButton("Change Password");
		btnChangePassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 boolean flag=true;
				
				//if(!(User.getPassword().equals(passwordField))
				{
					JLabel lblNewLabel = new JLabel("Check Again");
					lblNewLabel.setBounds(344, 30, 46, 14);
					panel.add(lblNewLabel);
					
					flag=false;
				}
				
				if(!(passwordField_1.equals(passwordField_2)))
				{
					JLabel lblNewLabel_1 = new JLabel("Password Doesnt Match");
					lblNewLabel_1.setBounds(335, 114, 46, 14);
					panel.add(lblNewLabel_1);
					flag=false;
					
				}
				
				if(flag){
					//update data base//
					String Query = new String("UPDATE users SET password="+passwordField_2);
					
								
				//	User.setpassword(passwordField_2);//Update the Entity// 
					
					JLabel lblNewLabel_2 = new JLabel("Password Changed Succesfully");
					lblNewLabel_2.setBounds(163, 156, 46, 14);
					panel.add(lblNewLabel_2);
					
					
					
					
				}
					
		
				
				
				
				
				
						
				
			}
		});
		btnChangePassword.setBounds(187, 192, 119, 23);
		panel.add(btnChangePassword);
		
		JButton btnCancle = new JButton("Cancel");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancle.setBounds(316, 192, 89, 23);
		panel.add(btnCancle);
		
		
		
	}
}
