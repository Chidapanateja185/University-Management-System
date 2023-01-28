
package university.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class Project extends JFrame implements ActionListener {
    
    Project(){
        setSize(1540, 850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon\\1087816.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,0,200,200);
        add(image);
        
        JMenuBar nb = new JMenuBar();
        
        //New Information
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLUE);
        nb.add(newInformation);
        //New faculty details
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        //New Student Details
        JMenuItem studentinfo = new JMenuItem("New Student Information");
        studentinfo.setBackground(Color.WHITE);
        studentinfo.addActionListener(this);
        newInformation.add(studentinfo);
      
        //Details
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLUE);
        nb.add(details);
        //View faculty details
        JMenuItem facultydetails = new JMenuItem("Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        //view Student Details
        JMenuItem studentdetails = new JMenuItem("Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //Leave
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        nb.add(leave);
        //Faculty Leave
        JMenuItem facultyleave = new JMenuItem("Faculty leave");
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        //Student Leave
        JMenuItem studentleave = new JMenuItem("Student leave");
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        //Leave Details
        JMenu leavedetails = new JMenu("Leave Details");
        leavedetails.setForeground(Color.BLUE);
        nb.add(leavedetails);
        //Faculty Leave Details
        JMenuItem facultyleavedetails = new JMenuItem("Faculty leave Details");
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leavedetails.add(facultyleavedetails);
        //Student Leave Details
        JMenuItem studentleavedetails = new JMenuItem("Student leave Details");
        studentleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leavedetails.add(studentleavedetails);
        
        //Exams
        JMenu exam = new JMenu("Examinations");
        exam.setForeground(Color.BLUE);
        nb.add(exam);
        //Exam Results
        JMenuItem examdetails = new JMenuItem("Examination Results");
        examdetails.setBackground(Color.WHITE);
        examdetails.addActionListener(this);
        exam.add(examdetails);
        //EnterMarks
        JMenuItem entermarks = new JMenuItem("Enter Exam Marks");
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //Department
        JMenu department = new JMenu("Department");
        department.setForeground(Color.BLUE);
        nb.add(department);
        //Chemical Engineering
        JMenuItem chemical = new JMenuItem("Chemical Engineering");
        chemical.setBackground(Color.WHITE);
        department.add(chemical);
        //Civil Engineering
        JMenuItem civil = new JMenuItem("Civil Engineering");
        civil.setBackground(Color.WHITE);
        department.add(civil);
        //Computer & Science Engineerin
        JMenuItem cse = new JMenuItem("Computer & Science Engineering");
        cse.setBackground(Color.WHITE);
        department.add(cse);
        //Computer Science & Business System
        JMenuItem csbs = new JMenuItem("Computer Science & Business System");
        csbs.setBackground(Color.WHITE);
        department.add(csbs);
        //Computer Science & Engineering(DS)
        JMenuItem ds = new JMenuItem("Computer Science & Engineering(DS)");
        ds.setBackground(Color.WHITE);
        department.add(ds);
        //Computer Science and Engineering(AI&ML)
        JMenuItem aiml = new JMenuItem("Computer Science and Engineering(AI&ML)");
        aiml.setBackground(Color.WHITE);
        department.add(aiml);
        //Computer Science and Engineering(IOT)
        JMenuItem iot = new JMenuItem("Computer Science and Engineering(IOT)");
        iot.setBackground(Color.WHITE);
        department.add(iot);
        //Electrial & Communication Engineering
        JMenuItem ee = new JMenuItem("Electrial & Communication Engineering");
        ee.setBackground(Color.WHITE);
        department.add(ee);
        //Electrical and Electronics Engineering
        JMenuItem EEE = new JMenuItem("Electrical and Electronics Engineering");
        EEE.setBackground(Color.WHITE);
        department.add(EEE);
        //Mechanical Engineering
        JMenuItem ME = new JMenuItem("Mechanical Engineering");
        ME.setBackground(Color.WHITE);
        department.add(ME);
        //Chemistry
        JMenuItem c = new JMenuItem("Chemistry");
        c.setBackground(Color.WHITE);
        department.add(c);
        //Mathematics and Humanities
        JMenuItem mh = new JMenuItem("Mathematics and Humanities");
        mh.setBackground(Color.WHITE);
        department.add(mh);
        //Physics
        JMenuItem phy = new JMenuItem("Physics");
        phy.setBackground(Color.WHITE);
        department.add(phy);
        //Computer Applications
        JMenuItem ca = new JMenuItem("Computer Applications");
        ca.setBackground(Color.WHITE);
        department.add(ca);
        
        //Fee Structure
        JMenu fee = new JMenu("Fee Structure Detais");
        fee.setForeground(Color.BLUE);
        nb.add(fee);
        //Fee Structure Details
        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);
        //Fee Form Details
        JMenuItem feeform = new JMenuItem("Fee Form");
        feeform.setBackground(Color.WHITE);
        feeform.addActionListener(this);
        fee.add(feeform);
        
        //Utility
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLUE);
        nb.add(utility);
        //Notepad
        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        //Calculator
        JMenuItem calc = new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        
        //Exit
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLUE);
        nb.add(exit);
        //Exit from app
        JMenuItem ex = new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        
        setJMenuBar(nb);
        
        setVisible(true);
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent e) {
        String msg = e.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }
        else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(IOException ev){}
        }
        else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(IOException eve){};
        }
        else if(msg.equals("New Student Information")){
            new AddStudent();
        }
        else if(msg.equals("New Faculty Information")){
            new AddFaculty();
        }
        else if(msg.equals("Faculty Details")){
            new TeacherDetails();
        }
        else if(msg.equals("Student Details")){
            new StudentDetails();
        }
        else if(msg.equals("Faculty leave")){
            new TeacherLeave();
        }
        else if(msg.equals("Student leave")){
            new StudentLeave();
        }
        else if(msg.equals("Faculty leave Details")){
            new TeacherLeaveDetails();
        }
        else if(msg.equals("Student leave Details")){
            new StudentLeaveDetails();
        }
        else if(msg.equals("Examination Results")){
            new ExaminationDetails();
        }
        else if(msg.equals("Enter Exam Marks")){
            new EnterMarks();
        }
        else if(msg.equals("Fee Structure")){
            new FeeStructure();
        }
        else if(msg.equals("Fee Form")){
            new StudentFeeForm();
        }
    }
    
    public static void main(String[] args) {
        new Project();
    }
    
}
