
package University;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

public class TeacherAttendance extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JButton b1,b2;
    Choice c1,c2,sh, fh;
    
    TeacherAttendance()
    {
        super("Teacher Attendance");
        setLayout(new GridLayout(4,2,50,50)); 
        c2 = new Choice();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery("select * from teacher");
            while(rst.next()){
                c2.add(rst.getString("emp_id"));
                
            }
        }
            catch(Exception e)
            {
                    
            }
            l7 = (new JLabel("Select Employee ID"));
            l7.setFont(new Font("Serif",Font.ITALIC,20));
            add(l7);
                    
            c2.setFont(new Font("Serif",Font.BOLD,20));

            add(c2);
            
            l1= new JLabel("First Half");
            l1.setFont(new Font("Serif",Font.ITALIC,20));

            fh = new Choice();
            fh.add("Present");
            fh.add("Absent");
            fh.add("Leave");
            fh.setFont(new Font("Serif",Font.BOLD,20));
            add(l1);
            add(fh);
            
            l2= new JLabel("Second Half");
            l2.setFont(new Font("Serif",Font.ITALIC,20));
            sh = new Choice();
            sh.add("Present");
            sh.add("Absent");
            sh.add("Leave");
            
            sh.setFont(new Font("Serif",Font.BOLD,20));
            
            add(l2);
            add(sh);
            
            b1= new JButton("Submit");
            b1.setBackground(Color.BLACK);
            b1.setForeground(Color.WHITE);
            
            
            b2= new JButton("Cancle");
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            
            
            add(b1);
            add(b2);
            
            b1.addActionListener(this);
            b2.addActionListener(this);
            
            getContentPane().setBackground(new Color(215,249,170));
            setVisible(true);
            setSize(500,600);
            setLocation(400,100);
            
            
        }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            
        
       String f = fh.getSelectedItem();
       String s = sh.getSelectedItem();
       String dt = new java.util.Date().toString();
       String id = c2.getSelectedItem();
       String sql = "insert into attendance_teacher values("+id+",'"+dt+"','"+f+"','"+s+"')";
       try
       {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Attendence Confirmed");
        this.setVisible(false);
        
       }
       catch(Exception e)
           
       {
           e.printStackTrace();
       }
        }
        else if(ae.getSource()==b2)
        {
            //JOptionPane.showMessageDialog(null, "Do You Want To Cancle");
            System.exit(0);
        }
    }
        public static  void main(String args[])
        {
            new TeacherAttendance().setVisible(true);
        }
    
    }

