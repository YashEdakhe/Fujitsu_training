import java.util.Scanner;

interface i1
{
	public void discount10(double price);		
}
interface i2 
{
	public void discount20(double price);	
}

class MultipleInterface implements i1,i2
{	
		static double discount=0;
		public void discount10(double price)
		{
			if(price > 500)
			{
				discount = (10/100)*price;
				System.out.println("Discounter price is"+discount);
			}
			else
			{
				System.out.println("Below 500 No discount...");		
			}
		}

		public void discount20(double price)
		{
			if(price > 1000)
			{
				discount = (20/100)*price;
				System.out.println("Discounter price is"+discount);				 	
			}
			else
			{
				discount10(price);	
			}
		}
}

public class MultipleInheritance 
	{
	public static void main(String args[])
		{
		MultipleInterface mi= new MultipleInterface();
		Scanner scan = new Scanner(System.in);
		double price = scan.nextDouble();
		mi.discount20(price);
		}
	} 