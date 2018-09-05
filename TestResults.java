import java.util.Scanner;

public class TestResults {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
	Scanner scan = new Scanner(System.in);
	int marks_1,marks_2;
	System.out.println("Enter two marks of exam");
	marks_1 = scan.nextInt();
	marks_2 = scan.nextInt();
	
	String result_1= getMarks(marks_1);
	String result_2= getMarks(marks_2);
	System.out.println("The Result is"+result_1);
	System.out.println("The Result is"+result_2);
	scan.close();
		
	}
	
	private static String getMarks(int marks)
	{
		String result ="";
		if(marks>=50)
		{
			result = "Passed";
		}
		else
		{
			result = "failed";
		}
	return result;	
	}

}
