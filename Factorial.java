package day7;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int i=1;
		int fact=1;
		System.out.println("Enter The Number to find factorial Of\n");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		
		do{
			fact = fact*i;
			i++;
		}while(i<=num);
		System.out.println(fact);
	}
}
