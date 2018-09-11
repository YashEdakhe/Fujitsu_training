package day7;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int f=1;
		int j = str.length()-1;
		int n = str.length();
		int k=j;
		
		for(int i=0;i<n/2;i++,j--)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				break;
			}
			f++;
		}
		if(f==k)
		{
			System.out.println("String not a palindrome");
		}
		else
		{
			System.out.println("String is Palindrome");
			
		}
		scan.close();
	}
	

}
