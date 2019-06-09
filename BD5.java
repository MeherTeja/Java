import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BD5 extends JFrame implements ActionListener
{
	JButton b1;JLabel l1,l2;JTextArea a;
	BD5()
	{
		setVisible(true);
		setLayout(null);
		b1=new JButton("count words");
		b1.setBounds(100,300,150,150);
		l1=new JLabel();
		l2=new JLabel();
		l1.setBounds(50,25,100,100);
		l2.setBounds(150,25,100,100);
		a=new JTextArea();
		a.setBounds(20,75,250,200);
		add(l1);add(l2);
		add(a);
		add(b1);
		pack();setSize(500,500);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String text=a.getText();
		String words[]=text.split("\\s");
		if(b1==ae.getSource())
		{
			l1.setText("Words:"+words.length);
			l2.setText("Characters:"+text.length());
		}
	}
	public static void main(String sda[])
	{
		new BD5();
	}
}