import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class LogW extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2;
	
	JTextField t1,t2;
	
	JButton b1,b2,b3;
	
	JPanel p,p1,p2;
	LogW()
	{
		setVisible(true);
		
		setLayout(new GridLayout(3,2));
		
		p=new JPanel();
		
		p1=new JPanel();
		
		p2=new JPanel();
		
		
		p.setBounds(50,100,40,40);
		
		p1.setBounds(0,0,0,0);
	
		p2.setBounds(50,0,100,100);
		
		l1=new JLabel("Name:");
		t1=new JTextField(8);
		
		l2=new JLabel("Password:");
		t2=new JTextField(8);
		
		b1=new JButton("submit");
		
		b2=new JButton("display");
		
		b3=new JButton("cancel");
		
		b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
		
		p.add(l1); p.add(t1);
		
		p1.add(l2); p1.add(t2);
		
		p2.add(b1); p2.add(b2);p2.add(b3);
		
		add(p);
		
		add(p1);
		
		add(p2);
		
		pack();
		setSize(1000,1000);
		
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1==ae.getSource())
		{
			s1();
		}
		if(b2==ae.getSource())
		{
			s2();
		}
		if(b3==ae.getSource())
		{
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
	void s1()
	{
		Connection c;
		ResultSet rs;
		Statement stmt;
		
			try{
	Class.forName("oracle.jdbc.driver.OracleDriver");  
  c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","SYSTEM");  
	  stmt=c.createStatement();  
  
	  rs=stmt.executeQuery("insert into new6 values('"+t1.getText()+"','"+t2.getText()+"')");
	  t1.setText("");
	  t2.setText("");
	 	c.close();	
	}
	catch(ClassNotFoundException e){ System.out.println(e);}  
catch(SQLException e){ System.out.println(e);}  
}
	
	
	
	void s2()
	{
		Connection c1;
		ResultSet rs1;
		Statement stmt1;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c1=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:xe","SYSTEM","SYSTEM");
			stmt1=c1.createStatement();
			rs1=stmt1.executeQuery("select * from new6 where Login='"+t1.getText()+"' ");		
			while(rs1.next())
			{
				t2.setText(rs1.getString(2));
			}
			c1.close();
		}
		catch(Exception e)
		{}
	}
	public static void main(String eca[])
	{
		new LogW();
	}
}