
package University;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;


public class ExaminationDetails extends JFrame implements ActionListener
{
    private JPanel contentpane;
    private JTable table;
    private JTextField search;
    private JButton b1,b2,b;
    
    
    public void Exam()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ums", "root", "");
            Statement st = con.createStatement();
            String sql = "select * from student";
            ResultSet rst = st.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rst));
            rst.close();
            st.close();
            con.close();
        }
        catch(Exception e) { }
        
    }
    public ExaminationDetails()
    {
        super ("Examination Details");
        setBounds(100,50,830,475);
        contentpane = new JPanel();
        contentpane.setBackground(Color.WHITE);
        //contentpane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentpane);
        contentpane.setLayout(null);
        
        JScrollPane scrollpane = new  JScrollPane();
        scrollpane.setBounds(79,133,1080,282);
        contentpane.add(scrollpane);
        getContentPane().setBackground(new Color(218, 240, 108));

        
        table = new JTable();
        table.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseClicked(MouseEvent arg)
        {
            int row = table.getSelectedRow();
            search.setText(table.getModel().getValueAt(row, 10).toString());
            
        }
        
        });
        table.setBackground(Color.YELLOW);
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS",Font.BOLD,16));
        scrollpane.setViewportView(table);
        
        b1= new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255,20,147),2,true));
        b1.setForeground(Color.RED);
        b1.setFont(new Font("Trebuchet MS",Font.BOLD,16));
        b1.setBounds(564, 89, 136, 33);
        contentpane.add(b1);
        
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,30));
        l1.setBounds(300, 15, 400, 47);
        contentpane.add(l1);
        
        
        search = new JTextField();
        search.setBackground(Color.WHITE);
        search.setBorder(new LineBorder(new Color(255,105,180),2,true));
        search.setForeground( new Color(47,79,78));
        search.setFont(new Font("Trebuchet MS",Font.BOLD | Font.ITALIC,17));
        search.setBounds(189, 89, 357, 33);
        contentpane.add(search);
        search.setColumns(10);
        
        JLabel l3 = new JLabel("Back");
        l3.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                setVisible(false);
            }
        });
        l3.setForeground(Color.GRAY);
        l3.setFont(new Font("Trebuchet MS",Font.BOLD ,29));
        l3.setBounds(97, 89 , 72, 33);
        contentpane.add(l3);
        
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0,128,128),3,true),"Exam Details",
        TitledBorder.LEADING,TitledBorder.TOP,null, new Color(0,128,0)));
        panel.setBounds(60, 54, 1100, 360);
        contentpane.add(panel);
        panel.setBackground(Color.WHITE);
        Exam();
        setSize(1200,500);
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
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);
            }
 
        }catch(Exception ex){}
    }
    public static void main(String args[])
    {
        new ExaminationDetails().setVisible(true);
    }
    
}
