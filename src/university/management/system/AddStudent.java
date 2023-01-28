
package university.management.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener {

    JTextField tfname, tfreg, tfather, tfphone,tfcity, tfxs;
    JTextField tfemail, tfaano, tfxiis;
    JDateChooser dob;
    JComboBox tfcourse, tfdept;
    JButton submit, cancel;
    JLabel lbname, reg, labreg,lbfather, phone, city, xs, labdob, email, aano, xiis, dept, course;
    
    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong()%9000L)+1000L);
    
    public AddStudent(){
        
        setSize(900,700);
        setLocation(350,50);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(350,30,500,50);
        heading.setFont(new Font("serif", Font.BOLD,20));
        heading.setForeground(Color.red);
        add(heading);
        
        //Name
        lbname = new JLabel("Name");
        lbname.setBounds(130,150,100,30);
        lbname.setFont(new Font("serif", Font.BOLD, 20));
        add(lbname);
        //Name Text Feild
        tfname = new JTextField();
        tfname.setBounds(230,160,130,20);
        add(tfname);
        
        //Regestration Number
        reg = new JLabel("Reg.No");
        reg.setBounds(130,220,80,30);
        reg.setFont(new Font("serif", Font.BOLD, 20));
        add(reg);
        //Text Feild For Regestration Number
        labreg = new JLabel("1583"+first4);
        labreg.setBounds(230,220,120,30);
        labreg.setFont(new Font("serif", Font.BOLD, 20));
        add(labreg);
        
        //Father's Name
        lbfather = new JLabel("Father's Name");
        lbfather.setBounds(90,295,150,30);
        lbfather.setFont(new Font("serif", Font.BOLD, 20));
        add(lbfather);
        //Text Feild for Father's Name
        tfather = new JTextField();
        tfather.setBounds(230,300,130,20);
        add(tfather);
        
        //Phone Number
        phone = new JLabel("Phone Number");
        phone.setBounds(90,360,150,30);
        phone.setFont(new Font("serif", Font.BOLD, 20));
        add(phone);
        //Text Feild for PHone Number
        tfphone = new JTextField();
        tfphone.setBounds(230,365,130,20);
        add(tfphone);
        
        //City
        city = new JLabel("City");
        city.setBounds(130,430,150,30);
        city.setFont(new Font("serif",Font.BOLD,20));
        add(city);
        //Text Feild for City
        tfcity = new JTextField();
        tfcity.setBounds(230, 435, 130, 20);
        add(tfcity);
        
        //X Percentage
        xs = new JLabel("X%");
        xs.setBounds(130,500,130,20);
        xs.setFont(new Font("serif", Font.BOLD,20));
        add(xs);
        //TextFeild for X Percentage
        tfxs = new JTextField();
        tfxs.setBounds(230,500,130,20);
        add(tfxs);
        
        //DOB
        labdob = new JLabel("D.O.B");
        labdob.setBounds(490,155,140,20);
        labdob.setFont(new Font("serif", Font.BOLD,20));
        add(labdob);
        //Text feild Date Of Birth
        dob = new JDateChooser();
        dob.setBounds(590,155,140,25);
        dob.setFont(new Font("serif", Font.BOLD,20));
        add(dob);
        
        //Email ID 
        email = new JLabel("Email Id");
        email.setBounds(490,220,130,20);
        email.setFont(new Font("serif", Font.BOLD, 20));
        add(email);
        //Text Feild for PHone Number
        tfemail = new JTextField();
        tfemail.setBounds(590,220,130,20);
        add(tfemail);
        
        //Aadhra Number
        aano = new JLabel("Aadhra No");
        aano.setBounds(490,290,130,20);
        aano.setFont(new Font("serif",Font.BOLD,20));
        add(aano);
        //Text Feild for Aadhr
        tfaano = new JTextField();
        tfaano.setBounds(590, 290, 130, 20);
        add(tfaano);
        
        //XII Percentage
        xiis = new JLabel("XII%");
        xiis.setBounds(490,360,130,20);
        xiis.setFont(new Font("serif", Font.BOLD,20));
        add(xiis);
        //TextFeild for XII Percentage
        tfxiis = new JTextField();
        tfxiis.setBounds(590,360,130,20);
        add(tfxiis);
        
        //Department
        dept = new JLabel("Department");
        dept.setBounds(490,430,130,20);
        dept.setFont(new Font("serif", Font.BOLD,20));
        add(dept);
        //Text Feild for Department
        String[] dep = {"B.Tech", "M.Tech","B.COM","BBA","MCA","BCA","M.COM"};
        tfdept = new JComboBox(dep);
        tfdept.setBounds(600,435,130,20);
        tfdept.setBackground(Color.WHITE);
        add(tfdept);
        
        //Branch
        course = new JLabel("Branch");
        course.setBounds(490,500,130,20);
        course.setFont(new Font("serif", Font.BOLD,20));
        add(course);
        //TextFeild for Branch
        String[] str = {"CHE", "CE","CSE","CS&BS","AI&ML","IOT","ECE","EEE","ME","Chesmistry","M&H","Physics","CA"};
        tfcourse = new JComboBox(str);
        tfcourse.setBounds(600,500,130,20);
        tfcourse.setBackground(Color.WHITE);
        add(tfcourse);
        
        //Submit Button
        submit = new JButton("Submit");
        submit.setBounds(510,580,130,30);
        submit.setBackground(Color.black);
        submit.addActionListener(this);
        submit.setFont(new Font("serif", Font.BOLD,20));
        submit.setForeground(Color.WHITE);
        add(submit);
        
        //Cancel Button
        cancel = new JButton("Cancel");
        cancel.setBounds(280,580,130,30);
        cancel.setBackground(Color.black);
        cancel.addActionListener(this);
        cancel.setFont(new Font("serif", Font.BOLD,20));
        cancel.setForeground(Color.WHITE);
        add(cancel);
        
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit){
            String name = tfname.getText();
            String regno = labreg.getText();
            String fathername = tfather.getText();
            String studentdob = ((JTextField)dob.getDateEditor().getUiComponent()).getText();
            String studentcity = tfcity.getText();
            String studentphone = tfphone.getText();
            String studentemail = tfemail.getText();
            String x = tfxs.getText();
            String xii = tfxiis.getText();
            String aadhr = tfaano.getText();
            String studentcourse = (String) tfcourse.getSelectedItem();
            String studentdept = (String) tfdept.getSelectedItem();
            
            
            try{
                String query = "insert into student values('"+name+"','"+fathername+"','"+regno+"','"+studentdob+"','"+studentcity+"', '"+studentphone+"','"+studentemail+"','"+x+"','"+xii+"','"+aadhr+"','"+studentdept+"','"+studentcourse+"')";
                
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student details Inserted Successfully");
                setVisible(false);
            }
            catch(Exception eb){eb.printStackTrace();}

        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new AddStudent();
    }   

}
