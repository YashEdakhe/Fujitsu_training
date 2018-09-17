import java.util.Scanner;

interface commanDetails
{
	public final static String str = "Section A";
	public void showDetails();
}

class Student implements commanDetails
	{
	 String student_name; 
	 int roll_number;
	public void setDetails(int roll_number,String student_name)
		{
		this.roll_number = roll_number; 
		this.student_name = student_name;
		}
	public void showDetails()
		{
		System.out.println(student_name+" Roll Number is "+roll_number+" belongs to "+str);	
		}
	}
class Student_Details
	{
	public static void main(String args[])
		{
		Student stu = new Student();
		System.out.println("Enter Roll number and Student Name");
		Scanner scan = new Scanner(System.in);
		int roll_number = scan.nextInt();
		String Student_name = scan.next();
		stu.setDetails(roll_number,Student_name);
		stu.showDetails();
		}
	}