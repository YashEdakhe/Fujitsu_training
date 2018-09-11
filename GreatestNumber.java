package day7;

import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args){
		
		int n,max;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		n=scan.nextInt();
		int a[]= new int[n];
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
			
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum value"+max);
		scan.close();
	}
		
}
