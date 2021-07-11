
package University;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

public class StudentAttendanceDetails extends JFrame implements ActionListener
{
    JTable l1;
    JButton b1;
    String h[]={"Roll Number","Date TIme","First Half","Second Half"};
    String d[][] =new String[15][4];
    int i = 0 ,j=0;
    
    StudentAttendanceDetails()
    {
        setTitle("Student Attendance Details");
        setSize(800,300);
        setLocation(400,200);
        
        try
        {
            String q = "select * from attendance_student";
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
           Statement st = con.createStatement();
           
           ResultSet rst = st.executeQuery(q);
           while(rst.next())
           {
               d[i][j++] = rst.getString("roll_no");
               d[i][j++] = rst.getString("date");
               d[i][j++] = rst.getString("first");
               d[i][j++] = rst.getString("second");
               i++;
               j=0;
           }
                l1 = new JTable(d,h);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        setLayout(new BorderLayout());
        b1 = new JButton("Print");
        add(b1,"South");
        JScrollPane s1  = new JScrollPane(l1);
        add(s1);
        
        b1.addActionListener(this);
 
    }
    public void actionPerformed(ActionEvent ae)
    {
        try
        {
            l1.print();
        }catch(Exception ex) { }
    }
    
    public static void main(String args[])
    {
         new StudentAttendanceDetails().setVisible(true);   
    }
    
    
    
    
}
