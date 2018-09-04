import java.util.*;
public class ArithmeticOperation {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers");
		
		int number_1=scan.nextInt();
		int number_2 =scan.nextInt();
		
		int addition=add(number_1,number_2);
		int subtraction=subtract(number_1,number_2);
		int multiplication=multiply(number_1,number_2);
		
		System.out.println("Addition is "+addition);
		System.out.println("Subtraction is "+subtraction);
		System.out.println("Multiplication "+multiplication);
		
		scan.close();
	}
	private static int add(int number_1, int number_2)
	{
		return number_1+number_2;
	}
	private static int multiply(int number_1,int number_2)
	{
		return number_1*number_2;
	}
	private static int subtract(int number_1,int number_2)
	{
		return number_1-number_2;
	}

}
	


