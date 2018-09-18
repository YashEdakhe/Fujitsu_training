import java.util.*;
interface i1
	{
	public void show_details();
	}

abstract class Student 
	{
	static int id = 0;
	static String name = "";
	static int marks = 0; 	

	void getInput()
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ID, Name, Marks (out of 500) of  Student");
		id = scan.nextInt();
		scan.nextLine();
		name = scan.nextLine();
		}
	
	abstract double calculate(int marks);
}	

class Student_Marklist extends Student implements i1
	{
	static double per;
	static String result;
		double calculate(int marks)
		{
			per = ((marks/5));
			if(per > 50)
				{
				result = "Pass";
				}	
			else
				{
				result = "fail";
				}
			return per;

		}
		public void show_details()
		{
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		//System.out.println("Marks: "+marks);
		System.out.println("percentage: "+per);
		System.out.println("Result : "+result);
		}
public static void main(String args[])
	{
		int marks = 0;
		Scanner Scan = new Scanner(System.in);
		Student_Marklist sm = new Student_Marklist();
		sm.getInput();
		marks = Scan.nextInt();
		sm.calculate(marks);
		sm.show_details();
	}
}





















