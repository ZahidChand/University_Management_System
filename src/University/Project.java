package University;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project extends JFrame implements ActionListener
{
    Project()
    {
        super("University Management System");
        setVisible(true);
        setSize(1920,1030);
        
        //****MASTER****
        
        JMenuBar mb = new JMenuBar();       //This Is For Menu Bar
        
        JMenu master = new JMenu("Master");     //This is Menu Which is on Top of MenuBar
        
        
        //This are menu Items whene you click on Menu then This menuitems popup
        JMenuItem m1 = new JMenuItem("New Facualty");
        JMenuItem m2 = new JMenuItem("New Student Addmission");
        master.setForeground(Color.BLUE);
        
        //Now here I have done Desiging and add mnemonic(shortcut key)
        m1.setFont(new Font("monospaced",Font.BOLD,16));
        m1.setMnemonic('A');
        m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.CTRL_MASK));
        m1.setBackground(Color.WHITE);
        
        m2.setFont(new Font("monospaced",Font.BOLD,16));
        m2.setMnemonic('B');
        m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
        m2.setBackground(Color.WHITE);
        
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        
        //****FOR DETAILS***
        
        JMenu user = new JMenu("Details");
        
        JMenuItem u1 = new JMenuItem("Student Details");
        JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);
        
        u1.setFont(new Font("monospaced",Font.BOLD,16));
        u1.setMnemonic('C');
        u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
        u1.setBackground(Color.WHITE);
        u2.setFont(new Font("monospaced",Font.BOLD,16));
        u2.setMnemonic('D');
        u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
        u2.setBackground(Color.WHITE);
        
        u1.addActionListener(this);
        u2.addActionListener(this);
        
        
        
        //****Attendance***
        
        
        JMenu attendance = new JMenu("Attendance");
        
        JMenuItem a1 = new JMenuItem("Student Attendance");
        JMenuItem a2 = new JMenuItem("Teacher Attendance");
        attendance.setForeground(Color.BLUE);
        
        a1.setFont(new Font("monospaced",Font.BOLD,16));
        a1.setMnemonic('M');
        a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
        a1.setBackground(Color.WHITE);
        attendance.add(a1);
        
        a2.setFont(new Font("monospaced",Font.BOLD,16));
        a2.setMnemonic('N');
        a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
        a2.setBackground(Color.WHITE);
        attendance.add(a2);
        
        a1.addActionListener(this);
        a2.addActionListener(this);
        
        
        //****Attendance Details**
        
        
         JMenu attendance_details = new JMenu("Attendance Details");
        
        JMenuItem b1 = new JMenuItem("Student Attendance Details");
        JMenuItem b2 = new JMenuItem("Teacher Attendance Details");
        attendance_details.setForeground(Color.RED);
        
        b1.setFont(new Font("monospaced",Font.BOLD,16));
        b1.setMnemonic('O');
        b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
        b1.setBackground(Color.WHITE);
        attendance_details.add(b1);
        
        b2.setFont(new Font("monospaced",Font.BOLD,16));
        b2.setMnemonic('P');
        b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
        b2.setBackground(Color.WHITE);
        attendance_details.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        
        //****Exam***
        
        JMenu exam = new JMenu("Examination");
        
        JMenuItem c1 = new JMenuItem("Examination Details");
        JMenuItem c2 = new JMenuItem("Examination Marks");
        exam.setForeground(Color.BLUE);
        
        c1.setFont(new Font("monospaced",Font.BOLD,16));
        c1.setMnemonic('Q');
        c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,ActionEvent.CTRL_MASK));
        c1.setBackground(Color.WHITE);
        exam.add(c1);
        
        c2.setFont(new Font("monospaced",Font.BOLD,16));
        c2.setMnemonic('R');
        c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
        c2.setBackground(Color.WHITE);
        exam.add(c2);
        
        c1.addActionListener(this);
        c2.addActionListener(this);
        
        
        
        //****Report***
        
        JMenu report = new JMenu("Update Details");
        
        JMenuItem r1 = new JMenuItem("Update Students");
        JMenuItem r2 = new JMenuItem("Update Teachers");
        report.setForeground(Color.RED);
        
        r1.setFont(new Font("monospaced",Font.BOLD,16));
        r1.setMnemonic('E');
        r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.CTRL_MASK));
        r1.setBackground(Color.WHITE);
        report.add(r1);
        
        r2.setFont(new Font("monospaced",Font.BOLD,16));
        r2.setMnemonic('F');
        r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,ActionEvent.CTRL_MASK));
        r2.setBackground(Color.WHITE);
        report.add(r2);
        
        r1.addActionListener(this);
        r2.addActionListener(this);
        
        //****Fees****
        
        JMenu fee = new JMenu("Fee Details");
        
        JMenuItem s1 = new JMenuItem("Fee Structure");
        //JMenuItem s2 = new JMenuItem("Student Fee Form");
        fee.setForeground(Color.BLUE);
        
        s1.setFont(new Font("monospaced",Font.BOLD,16));
        s1.setMnemonic('J');
        s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J,ActionEvent.CTRL_MASK));
        s1.setBackground(Color.WHITE);
        fee.add(s1);
        
       /* s2.setFont(new Font("monospaced",Font.BOLD,16));
        s2.setMnemonic('K');
        s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.CTRL_MASK));
        s2.setBackground(Color.WHITE);
        fee.add(s2);
        */
        s1.addActionListener(this);
        //s2.addActionListener(this);
        
        //****Utility***
        
        JMenu utility  = new JMenu("Utility");
        
        JMenuItem ut1  = new JMenuItem("Notepad");
        JMenuItem ut2  = new JMenuItem("Calculator");
        JMenuItem ut3  = new JMenuItem("Web Browser");
        
        utility.setForeground(Color.RED);
        
        ut1.setFont(new Font("momospaced",Font.BOLD,12));
        ut1.setMnemonic('I');
        ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,ActionEvent.CTRL_MASK));
        ut1.setBackground(Color.WHITE);
        
        ut2.setFont(new Font("momospaced",Font.BOLD,12));
        ut2.setMnemonic('U');
        ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
        ut2.setBackground(Color.WHITE);
        
        ut3.setFont(new Font("momospaced",Font.BOLD,12));
        ut3.setMnemonic('V');
        ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
        ut3.setBackground(Color.WHITE);
        
        
        ut1.addActionListener(this);
        ut2.addActionListener(this);
        ut3.addActionListener(this);
        
        
        
        //****About****
        
        JMenu about = new JMenu("About");
        
        JMenuItem aboutus = new JMenuItem("About Us");
        about.setForeground(Color.BLUE);
        
        aboutus.setFont(new Font("momospaced",Font.BOLD,12));
        aboutus.setMnemonic('L');
        aboutus.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L,ActionEvent.CTRL_MASK));
        aboutus.setBackground(Color.WHITE);
        about.add(aboutus);
        
        
        aboutus.addActionListener(this);
        
        
        //****Exit****
        
        
        JMenu exit = new JMenu("Exit");
        
        JMenuItem ex = new JMenuItem("Exit");
        exit.setForeground(Color.RED);
        
        ex.setMnemonic('Z');
        ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
        ex.setBackground(Color.WHITE);
        
        
        ex.addActionListener(this);
        
        
        master.add(m1);
        master.add(m2);
        
        user.add(u1);
        user.add(u2);
        
        report.add(r1);
        report.add(r2);
        
        fee.add(s1);
        //fee.add(s2);
        
        utility.add(ut1);
        utility.add(ut2);
        utility.add(ut3);
        
       // about.add(aboutus);
        
        
        exit.add(ex);
        
        mb.add(master);
        mb.add(user);
        mb.add(attendance);
        mb.add(attendance_details);
        mb.add(exam);
        mb.add(report);
        mb.add(fee);
        mb.add(utility);
        mb.add(about);
        mb.add(exit);
        
        
        setJMenuBar(mb);
        
        setFont(new Font ("senserif",Font.BOLD,16));
        setLayout(new FlowLayout());
        //setVisible(false);
        getContentPane().setBackground(new Color(229,204,255));

        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String msg = ae.getActionCommand();
        if(msg.equals("New Facualty"))
        {
           new AddTeacher().f.setVisible(true);
        }
        else if(msg.equals("New Student Addmission"))
        {
            new AddStudent().f.setVisible(true);
        }
        else if(msg.equals("Student Details"))
        {
            new StudentDetails().setVisible(true);
        }
        else if(msg.equals("Teacher Details"))
        {
            new TeacherDetails().setVisible(true);
        }
        else if(msg.equals("Update Students"))
        {
            new UpdateStudent().f.setVisible(true);
        }
        else if(msg.equals("Update Teachers"))
        {
            new UpdateTeacher().f.setVisible(true);
        }
        else if(msg.equals("Fee Structure"))
        {
            new FeeStructure().setVisible(true);
        }
        else if(msg.equals("Student Fee Form"))
        {
          //  new StudentFeeForm().setVisible(true);
        }
        else if(msg.equals("Notepad"))
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e) { }
        }
        else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e){}
        }
        else if(msg.equals("Web Browser"))
        {
            try{
                Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\crome.exe");
            }
            catch(Exception e){ }
        }
        else if(msg.equals("Exit"))
        {
            System.exit(0);
        }
        else if(msg.equals("About Us"))
        {
            new AboutUs().setVisible(true);
        }
        else if(msg.equals(("Student Attendance")))
        {
           new StudentAttendance().setVisible(true);
        }
        else if(msg.equals("Teacher Attendance"))
        {
            new TeacherAttendance().setVisible(true);
        }
        else if(msg.equals("Student Attendance Details"))
        {
            new StudentAttendanceDetails().setVisible(true);
        }
        else if(msg.equals("Teacher Attendance Details"))
        {
            new TeacherAttendanceDetails().setVisible(true);
        }
        else if(msg.equals("Examination Details"))
        {
            new ExaminationDetails().setVisible(true);
        }
        else if(msg.equals("Examination Marks"))
        {
            new ExaminationMarks().setVisible(true);
        }

    }
        public static void main(String args[])
        {
         new Project().setVisible(true);   
        }
        
    }

