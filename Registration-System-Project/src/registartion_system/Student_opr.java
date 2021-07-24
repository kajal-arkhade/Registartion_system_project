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

public class Student_opr extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JLabel label;
    private JPanel contentPane;
    private JTextField textField_6;
    private JPasswordField passwordField_1;
    private JTextField textField_7;
    private JTextField textField_8;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Student_opr frame = new Student_opr();
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
    public  Student_opr() {
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
		
		JLabel lblNewLabel_1_7 = new JLabel("ID");
		lblNewLabel_1_7.setForeground(Color.BLACK);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_7.setBounds(415, 82, 124, 46);
		contentPane.add(lblNewLabel_1_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(647, 82, 224, 46);
		contentPane.add(textField_6);
       
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(415, 147, 124, 46);
		contentPane.add(lblNewLabel_1);
	       
		
		JLabel lblNewLabel_1_1 = new JLabel("Surname");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_1.setBounds(415, 203, 124, 46);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_2.setBounds(415, 283, 124, 46);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Mobile");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_3.setBounds(415, 354, 124, 46);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_4.setBounds(415, 432, 124, 46);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("City");
		lblNewLabel_1_5.setForeground(Color.BLACK);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_5.setBounds(415, 501, 124, 46);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Password");
		lblNewLabel_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_5_1.setBounds(415, 591, 124, 46);
		contentPane.add(lblNewLabel_1_5_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(647, 596, 224, 46);
		contentPane.add(passwordField_1);
		
	
		textField = new JTextField();
		textField.setBounds(647, 143, 224, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(647, 208, 224, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(647, 288, 224, 46);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(647, 359, 224, 46);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(647, 506, 224, 46);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(647, 437, 224, 46);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1_6 = new JLabel("Enter Student ID :");
		lblNewLabel_1_6.setForeground(Color.BLACK);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel_1_6.setBounds(10, 250, 189, 46);
		contentPane.add(lblNewLabel_1_6);
		
		textField_7 = new JTextField();
		textField_7.setBounds(218, 250, 76, 46);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		
		
		
		
		final JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnNewButton.setBounds(374, 662, 179, 46);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String value1=textField.getText();
				String value2=textField_1.getText();
				String value3=textField_2.getText();
				String value4=textField_3.getText();
				String value5=textField_4.getText();
				String value6=textField_5.getText();
				String value7=textField_6.getText();
				String value8=passwordField_1.getText();
				
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
					PreparedStatement st=con.prepareStatement("insert into Student(id,name,surname,email,mobile,gender,city,pass) values(?,?,?,?,?,?,?,?)");
					st.setString(1,value1);
					st.setString(2,value2);
				 	st.setString(3,value3);
					st.setString(4,value4);
					st.setString(5,value5);
					st.setString(6,value6);
					st.setString(7,value7);
					st.setString(8,value8);
					
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
				textField_6.setText("");
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnEdit.setBounds(602, 662, 179, 46);
		contentPane.add(btnEdit);
		
		final JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String value1=textField_7.getText();
				Connection con=null;
				
				String url="jdbc:mysql://localhost:3306/";
				String db="Payroll";
				String driver="com.mysql.cj.jdbc.Driver";
				String user="root";
				String pass="Mysql";
				
				try
				{
					Class.forName(driver);
					con=DriverManager.getConnection(url+db,user,pass);
					PreparedStatement st=con.prepareStatement("delete from Student where id=?");
					st.setString(1,value1);
					st.executeUpdate();
					
					JOptionPane.showMessageDialog(btnDeleteStudent,"Data is successfully deleted from database");
					con.close();
				}
				catch(Exception ea)
				{
				JOptionPane.showMessageDialog(btnDeleteStudent,"Error ");
				}
				}
			}
		);
	
		btnDeleteStudent.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnDeleteStudent.setBounds(45, 165, 179, 46);
		contentPane.add(btnDeleteStudent);
		
		
		
	}
}
