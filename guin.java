import javax.swing.*;
import java.awt.event.*;
import java.util.Arrays;
class guin extends JFrame implements ItemListener
{
	JComboBox jcb;
	JTextField jtf;
	static double sal[] ={9000,75000,4400,59000,6500};
	guin()
	{
		jcb=new JComboBox();
		jtf=new JTextField();
		add(jcb);
		add(jtf);
		setLayout(null);
		jcb.addItem("Highest");
		jcb.addItem("2nd Highest");
		jcb.addItem("3rd Highest");
		jcb.addItem("4th Highest");
		jcb.addItem("Lowest");
		jcb.addItemListener(this);
		jcb.setBounds(50,50,100,30);
		jtf.setBounds(100,100,100,30);
		setVisible(true);
		setSize(300,300);
		
	}
	public void itemStateChanged(ItemEvent ae)
	{
		if(ae.getStateChange()==ae.SELECTED)
		{
			String str1 = jcb.getSelectedItem().toString();
			if(str1.equals("Highest"))
			{
			String str = String.valueOf((sal[4]));		
			jtf.setText(str);
			}
			if(jcb.getSelectedItem().equals("2nd Highest"))
			{
			String str = String.valueOf((sal[3]));		
			jtf.setText(str);
			}
			if(jcb.getSelectedItem().equals("3rd Highest"))
			{
			String str = String.valueOf((sal[2]));		
			jtf.setText(str);
			}
			if(jcb.getSelectedItem().equals("4th Highest"))
			{
			String str = String.valueOf((sal[1]));		
			jtf.setText(str);
			}
			if(jcb.getSelectedItem().equals("Lowest"))
			{
			String str = String.valueOf((sal[0]));		
			jtf.setText(str);
			}
			
		}
	}
	void cal(double a[])
	{
		Arrays.sort(a);
		System.out.println(a);
		
	}
	public static void main(String a[])
	{
		guin g=new guin();
		
		g.cal(sal);		
	}
	
	
}