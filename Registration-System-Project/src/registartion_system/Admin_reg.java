package registartion_system;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Admin_reg extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;
    private JTextField textField_6;
    private JPasswordField passwordField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Admin_reg frame = new Admin_reg();
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
    public  Admin_reg() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 895, 730);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("New User Registration");
        lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(264, 25, 326, 64);
		contentPane.add(lblNewLabel);
       
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(293, 138, 124, 46);
		contentPane.add(lblNewLabel_1);
	       
		
		JLabel lblNewLabel_1_1 = new JLabel("Surname");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(293, 203, 124, 46);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_2.setBounds(293, 283, 124, 46);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mobile");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_3.setBounds(293, 354, 124, 46);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Department");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_4.setBounds(293, 432, 124, 46);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("City");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_5.setBounds(293, 501, 124, 46);
		contentPane.add(lblNewLabel_1_5);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(570, 589, 224, 46);
		contentPane.add(passwordField_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Password");
		lblNewLabel_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_5_1.setBounds(293, 589, 135, 46);
		contentPane.add(lblNewLabel_1_5_1);
		
	
		textField = new JTextField();
		textField.setBounds(570, 138, 224, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(570, 208, 224, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(570, 288, 224, 46);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(570, 359, 224, 46);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(570, 506, 224, 46);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(570, 432, 224, 46);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
				Admin_login al=new Admin_login();
				al.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnNewButton_1.setBounds(43, 203, 157, 46);
		contentPane.add(btnNewButton_1);
	
		final JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(43, 283, 179, 46);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String value1=textField.getText();
				String value2=textField_1.getText();
				String value3=textField_2.getText();
				String value4=textField_3.getText();
				String value5=textField_4.getText();
				String value6=textField_5.getText();
				String value7=passwordField_1.getText();
				Connection con=null;
				
				String url="jdbc:mysql://localhost:3306/";
				String db="Payroll";
				String driver="com.mysql.cj.jdbc.Driver";
				String user="root";
				String pass="Mysql";
				
				try
				{
					
					Class.forName(driver);
					con = DriverManager.getConnection(url+db, user, pass);
					PreparedStatement st=con.prepareStatement("insert into Admin(name,surname,email,mobile,dept,city,pass) values(?,?,?,?,?,?,?)");
					st.setString(1,value1);
					st.setString(2,value2);
				 	st.setString(3,value3);
					st.setString(4,value4);
					st.setString(5,value5);
					st.setString(6,value6);
					st.setString(7,value7);
					
					st.executeUpdate();
					
					JOptionPane.showMessageDialog(btnNewButton,"Data is successfully inserted into database.");		
					
				}
					catch(Exception ea)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Error.");
			
			}
			}	});
		
		contentPane.add(btnNewButton);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnEdit.setBounds(43, 354, 179, 46);
		contentPane.add(btnEdit);
		
		
		
		
	}
}
