package swing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.Statement;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel register_info;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 507);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("User Name: ");
		lblNewLabel.setBounds(135, 132, 79, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setBounds(133, 167, 53, 14);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(224, 129, 114, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(224, 164, 114, 20);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setIcon(new ImageIcon("E:\\shankar furniture\\icons\\bill.png"));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText().toString();
				String password = passwordField.getText().toString();

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/broadway", "root", "");
					String sqlogin = "select * from user where username = '" + username + "' and password = '"
							+ password + "'";
					Statement stm = (Statement) con.createStatement();
					ResultSet rs = stm.executeQuery(sqlogin);

					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Successfully loged in", "Login Successful",
								JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(null, "User not found", "Login Failed",
								JOptionPane.ERROR_MESSAGE);
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(190, 195, 148, 73);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_2 = new JLabel("Login Here");
		lblNewLabel_2.setBackground(Color.DARK_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setBounds(158, 62, 155, 37);
		contentPane.add(lblNewLabel_2);
		contentPane.add(getRegister_info());
	}

	private JLabel getRegister_info() {
		if (register_info == null) {
			register_info = new JLabel("");
			register_info.setBounds(135, 254, 46, 14);
		}
		return register_info;
	}
}
