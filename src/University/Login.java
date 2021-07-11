
package University;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.white;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener 
{
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
    Login()
    {
        super("Login");
        
       // setBackground(Color.white);
        getContentPane().setBackground(new Color(218, 240, 108));

        setLayout(null);
        l1 = new JLabel("UserName");
        l1.setBounds(40, 20, 100, 30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        add(l2);
        
        t1= new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);
        
        t2= new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        b1= new JButton("Login");
        b1.setBounds(40,150,120,30);
        b1.addActionListener(this);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        b2= new JButton("Cancle");
        b2.setBounds(180,150,120,30);
        b2.addActionListener(this);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.WHITE);
        add(b2);
         
        setVisible(true);
        setSize(400,300);
        setLocation(400,200);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
            Statement st = con.createStatement();
            String sql = "Select * from login where userName='" + t1.getText() + "' and Password ='" + t2.getText() + "'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) 
            {
                JOptionPane.showMessageDialog(null, "Login Succesfull....");
                new Project();
                this.setVisible(false);
                
               // System.out.println("Login hue Re babab Finallyyyyyyyy");
                
            } else 
            {
                JOptionPane.showMessageDialog(null, "Incorrect Login and Password....");
                t1.setText("");
                t2.setText("");
            }
        }
        catch (Exception e) 
        {
           System.out.println(e); 
        }
        }
        else if(ae.getSource()==b2)
          {
              JOptionPane.showMessageDialog(null, "Are you Sure You Want To Exit");
            System.exit(0);
          }
        
    }
public static void main(String args [])
{
    new Login();
}




}




