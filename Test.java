import java.util.*;
abstract class SalaryStruct
{
	abstract double cal(double a[]);
}
class Test extends SalaryStruct
{
	
	public static void main(String a[])
	{
		double sal[] =new double[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salaries :");
		for(int i=0;i<sal.length;i++)
		{
			sal[i]=sc.nextDouble();
		}
		Test t=new Test();
		double secondhigh=t.cal(sal);
		System.out.println("The Second Hightest Salary is :"+secondhigh);		
	}
	double cal(double a[])
	{
		Arrays.sort(a);
		return a[3];
	}
}