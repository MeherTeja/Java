import javax.swing.*;
import java.awt.*;
class ButtonDemo1 extends Frame
{
	JButton b1;
	JPanel p1;
	ButtonDemo1()
	{
	setVisible(true);
	setLayout(null);
	b1=new JButton("click me");
	b1.setBounds(100,50,120,140);
	pack();setSize(500,500);
	add(b1);
	}
public static void main(String ewf[])
{
	new ButtonDemo1();
}
}