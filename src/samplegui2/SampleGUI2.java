package samplegui2;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Models.*;

public class SampleGUI2 {
    static JFrame fr;
    static JPanel p1;
    static JLabel l1;
    static JLabel l2;
    static JTextField t1;
    static JTextField t2;
    static JButton b1;
    static JLabel r1;
    
    public static void main(String[] args) {
        fr=new JFrame();
        Image icon=Toolkit.getDefaultToolkit().getImage("icon.png");
        fr.setTitle("Nestor GUI");
        p1=new JPanel();
        p1.setLayout(null);
        l1=new JLabel ("Enter a Number: ");
        l1.setBounds(25,30,150,30);
        l2=new JLabel ("Enter a Number: ");
        l2.setBounds(25,60,250,30);
        t1=new JTextField(20);
        t1.setBounds(140,30,150,30);
        Color c1=Color.orange;
        t1.setBackground(c1);
        t2=new JTextField(20);
        t2.setBounds(140,60,150,30);
        Color c2=Color.YELLOW;
        t2.setBackground(c2);
        b1=new JButton("CLICK ME");
        b1.setBounds(160,100,100,30);
        b1.addActionListener(new Nestor());
        r1=new JLabel("Here the Result");
        r1.setForeground(Color.BLUE);
        r1.setBounds(130, 130, 150, 30);
        
        fr.add(p1);
        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(t2);
        p1.add(b1);
        p1.add(r1);
        
        fr.setIconImage(icon);
        fr.setSize(350, 200);
        fr.setLocation(400,400);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public static class Nestor implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            double a=Double.parseDouble(t1.getText());
            double b=Double.parseDouble(t2.getText());
            Calculation c=new Calculation(a, b);
            c.Addition();
            r1.setText("The result is ==>"+c.getResult());
            
        }
     }
}
