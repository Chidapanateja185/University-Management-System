package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    
    JButton login, cancel;
    JTextField tfusername, tfpassword;
    
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        //Username Feild
        JLabel Iblusername = new JLabel("UserName");
        Iblusername.setBounds(170,50,100,50);
        add(Iblusername);
        //Text Feild
        tfusername = new JTextField();
        tfusername.setBounds(250,65,150,20);
        add(tfusername);
        //PassWord feild
        JLabel Iblpassword = new JLabel("PassWord");
        Iblpassword.setBounds(170,90,100,50);
        add(Iblpassword);
        //PassWord Text Feild
        tfpassword = new JPasswordField();
        tfpassword.setBounds(250,105,150,20);
        add(tfpassword);
        //Login Button
        login = new JButton("Login");
        login.setBounds(150,150, 120, 30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        login.setFont(new Font("serif", Font.BOLD, 15));
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(400,150, 120, 30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD, 15));
        add(cancel);
        
        //Size of the frame
        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == login){
           String username = tfusername.getText();
           String password = tfpassword.getText();
           
           String query = "select * from login where username='"+username+"'and password='"+password+"'";
           
          try {
                Conn c = new Conn();
                ResultSet rs = (ResultSet) c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
           }
           catch(Exception et){
           }
       }
       else if(e.getSource() == cancel){
           setVisible(false);
       }
    }
    public static void main(String[] args) {
        new Login();
    }
}

