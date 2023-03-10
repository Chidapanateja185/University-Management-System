package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    Splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon\\istockphoto-1142918319-612x612.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        t = new Thread(this);
        t.start();
        
        setVisible(true);
        int x = 1;
        for(int i=2;i<=600;i+=2, x+=1){
            setLocation(600-((i+x)/2),350-(i/2));
            setSize(265+i+x/2, i+x/2);
        }
        try {
            Thread.sleep(10);
        }
        catch(InterruptedException e){
        }
    }
    @Override
    @SuppressWarnings("empty-statement")
    public void run() {
        try {
            Thread.sleep(7000);
            //next web page
            new Login();
        }
        catch(InterruptedException e){};
    }
    public static void main(String[] args) {
               new Splash();
    }
}