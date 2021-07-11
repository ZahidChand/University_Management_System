
package University;

import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame 
{
    JTextArea t1;
    JPanel p1;
    
    Marks(){}
    Marks(String str)
    {
        super("Marks");
        setSize(500,600);
        setLayout(new BorderLayout());
        
        p1 = new JPanel();
        
        t1 =new JTextArea(50,15);
        JScrollPane jsp= new JScrollPane(t1);
        t1.setFont(new Font("Senserif",Font.ITALIC,18));
        
        add(p1,"North");
        
        add(jsp,"Center");
        
        setLocation(200,50);
        mark(str);

    }
    public void mark(String s)
    {
        try
        {
            
            t1.setText(("\tResult of Examination\n\nSubject\n"));
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
            Statement st = con.createStatement();  
        
            
            ResultSet rst1 = st.executeQuery("select * from subject where roll_no="+s);
        
        if(rst1.next())
        {
            t1.append("\n\t"+rst1.getString("subject1"));
            t1.append("\n\t"+rst1.getString("subject2"));
            t1.append("\n\t"+rst1.getString("subject3"));
            t1.append("\n\t"+rst1.getString("subject4"));
            t1.append("\n\t"+rst1.getString("subject5"));
            t1.append("\n*************************************************");
            t1.append("\n");
        }
        
            ResultSet rst2 = st.executeQuery("select * from marks where roll_no="+s);
        
        if(rst2.next())
        {
            int marks1 = Integer.parseInt(rst2.getString("marks1"));
            int marks2 = Integer.parseInt(rst2.getString("marks2"));
            int marks3 = Integer.parseInt(rst2.getString("marks3"));
            int marks4 = Integer.parseInt(rst2.getString("marks4"));
            int marks5 = Integer.parseInt(rst2.getString("marks5"));
            
            int total = marks1+marks2+marks3+marks4+marks5;
            
            
            t1.append("\nMarks\n\n\t"+rst2.getString("marks1"));
            t1.append("\n\t"+rst2.getString("marks2"));
            t1.append("\n\t"+rst2.getString("marks3"));
            t1.append("\n\t"+rst2.getString("marks4"));
            t1.append("\n\t"+rst2.getString("marks5"));
            t1.append("\n*************************************************");
            t1.append("\n");
            t1.append("\nTOtal");
            t1.append(total+" :/500");
    
        }
        }
        catch(Exception e)
                { 
                    e.printStackTrace();
                }
        }
    

        public static void main(String args[])
        {
            new Marks().setVisible(true);
        }
}

    
    
    

