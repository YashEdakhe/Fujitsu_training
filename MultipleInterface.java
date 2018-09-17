import java.util.Scanner;

interface i1{
	public double discount10(double price);		
}
interface i2{
	public double discount20(double price);	
}

 class MultipleInterface implements i1,i2

{	
static double discount=0;
		public double discount10(double price)
		{
		if(price > 500)
			{
			double discount = (0.1*price)/100;
			}
		return discount;			
		}	

		public double discount20(double price)
		{
		if(price > 1000)
			{
			double discount = (0.2*price)/100;
			}
		else
			{
			discount10(double price)	
			}return discount;	
		}
		
}

public class MultipleInheritance 
	{
	public static void main(String args[])
		{
		MultipleInterface mi= new MultipleInterface();
		Scanner scan = new Scanner(System.in);
		double price = scan.nextDouble();
		mi.discount10(price);
		mi.discount20(price);	
		}
	} 