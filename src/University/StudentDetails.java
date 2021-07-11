
package University;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentDetails extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTable t1;
JButton b1,b2,b3;
JTextField t2;

String x[] = {"Name","Father Name","Age","Date Of Birth","Address","Phone","Email","Class X","Class XII","Aadhar No","Roll No","Course","Branch"};
String y[][] = new String[20][13];
int i=0,j=0;

StudentDetails()
{
    setTitle("Student Details");
    setSize(1260,650);
    setLocation(50,20);
    setLayout(null);
    getContentPane().setBackground(new Color(204, 204, 255));

    l1 = new JLabel("Enter Roll No to Delete Student :  ");
    l1.setBounds(50, 360, 400, 30);
    l1.setFont(new Font("serif",Font.BOLD,20));
    add(l1);
    
    t2 = new JTextField();
    t2.setBounds(400, 360, 200, 30);
    add(t2);
    
    b1= new JButton("Delete");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(620, 360, 100, 30);
    add(b1);
    
    l2 = new JLabel("Add New Student");
    l2.setBounds(50, 450, 400, 30);
    l2.setFont(new Font("serif",Font.BOLD,20));
    add(l2);
    
    b2= new JButton("Add Student");
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    b2.setBounds(300, 450, 150, 30);
    add(b2);
    
    
    l3 = new JLabel("Update Student Details");
    l3.setBounds(50, 490, 400, 30);
    l3.setFont(new Font("serif",Font.BOLD,20));
    add(l3);
    
    b3= new JButton("Update Student");
    b3.setBackground(Color.BLACK);
    b3.setForeground(Color.WHITE);
    b3.setBounds(300, 490, 150, 30);
    add(b3);
    
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
        Statement st = con.createStatement();
        String q = "select * from student";
        ResultSet rst =  st.executeQuery(q);
        while(rst.next())
        {
            y[i][j++] = rst.getString("name");
            y[i][j++] = rst.getString("father_name");
            y[i][j++] = rst.getString("age");
            y[i][j++] = rst.getString("dob");
            y[i][j++] = rst.getString("address");
            y[i][j++] = rst.getString("phone");
            y[i][j++] = rst.getString("email");
            y[i][j++] = rst.getString("class_x");
            y[i][j++] = rst.getString("class_xii");
            y[i][j++] = rst.getString("adharno");
            y[i][j++] = rst.getString("roll_no");
            y[i][j++] = rst.getString("course");
            y[i][j++] = rst.getString("branch");
            i++;
            j=0; 
        }
        t1 = new JTable(y,x);
  
    }
    catch(Exception ex)
    {
        ex.printStackTrace();
    }
    JScrollPane xp = new JScrollPane(t1);
    xp.setBounds(20, 20, 1200, 330);
    add(xp);
    
    //getContentPane().setBackground(Color.WHITE);
    
    b1.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
    try
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
        Statement st = con.createStatement();
        
        if(ae.getSource()==b1)
        {
            try
            { 
            String k = t2.getText();
            String sql = "delete from student where roll_no = '"+k+"'";
            st.executeUpdate(sql);
            this.setVisible(false);
            new StudentDetails().setVisible(true);
                
            }
            catch(Exception e){}
        }
        else if(ae.getSource()==b2)
        {
            new AddStudent().f.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==b3)
        {
            new UpdateStudent().f.setVisible(true);
            this.setVisible(false);
        }
        
    }catch(Exception e){}
    
}
public static void main(String args[])
{
    new StudentDetails().setVisible(true);
}



}
    

