import java.awt.*;
import java.awt.event.*;


class GUI extends Frame implements ActionListener
{
	TextField t1, t2, t3;
	Button b;

	GUI(){
		b = new Button("Addition");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		add(t1);
		add(t2);
		add(t3);
		add(b);

		setLayout(null);
		b.addActionListener(this);

		t1.setBounds(50,50,70,30);
		t2.setBounds(50,100,70,30);
		t3.setBounds(50,150,70,30);
		b.setBounds(50,200,500,30);

		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
	Addition add = new Addition();
		if(ae.getSource()==b)
		{
			String a=t1.getText();
			int i1 = Integer.parseInt(a);
			String b=t2.getText();
			int i2 = Integer.parseInt(b);
			String str = String.valueOf(add.display(i1,i2));
			t3.setText(str);
		}
	}

	public static void main(String args[])
	{
		GUI g = new GUI();
		
	}
 }