
package University;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import javax.swing.*;

public class AboutUs extends JFrame
{
    private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

           

            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(140, 40, 200, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v1.1");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);

            
            JLabel l7 = new JLabel("Developer Name - Zahid Chand");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 198, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("Contact : chandzahid333@gmail.com");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 260, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("Education - Master in Computer Applications");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 340, 600, 34);
            contentPane.add(l9);


            JLabel l10 = new JLabel("Phone - +91 xxxxxxxx93");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 390, 600, 34);
            contentPane.add(l10);
                
                
            contentPane.setBackground(Color.WHITE);
            //setSize(400, 500);
            setLocation(100, 50);
	}
        

}
    
