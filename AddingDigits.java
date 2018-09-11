package day7;

import java.util.Scanner;

public class AddingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		scan.close();
		
		do
		{
			System.out.println("test "+num);
			int rem = num%10;
			s=s+rem;
			num = num/10;
			
		}while(num!=0);

		System.out.println("the sum of the digits = "+s);
	}

}
