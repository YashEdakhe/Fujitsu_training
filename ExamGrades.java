import java.util.Scanner;

public class ExamGrades {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Marks out of 100");
	int marks = scan.nextInt();
	
	String result = showGrades(marks);
	System.out.println("Grade is "+ result);
	scan.close();
	}
	
	private static String showGrades(int marks)
	{
		String result ="";
		if(marks >= 90 && marks<=100 )
		{
			result = "A";
		}
		else if(marks >=75  && marks<90 )
		{
			result = "B";
		}
		else if(marks >=55 && marks<75)
		{
			result = "C";
		}
		else
		{
			result = "F";
		}
		return result;
	}
}


