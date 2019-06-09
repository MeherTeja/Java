import javax.swing.*;
class BD6 extends JFrame
{
	JRadioButton r1,r2;
	ButtonGroup bg;
	BD6()
	{
		setVisible(true);
		setLayout(null);
		r1=new JRadioButton("Male:");
		r2=new JRadioButton("Female:");
		r1.setBounds(100,50,130,130);
		r2.setBounds(100,150,130,130);
		bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(r1);
		add(r2);
		pack();setSize(500,500);
	}
	public static void main(String wddd[])
	{
		new BD6();
	}
}