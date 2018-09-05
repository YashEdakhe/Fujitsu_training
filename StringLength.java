import java.util.Scanner;

public class StringLength {
	public static void main(String args[])
	{
		String name;
		Scanner scan = new Scanner(System.in);
		name= scan.nextLine();
		
		int result_1= getLength(name);
		String result_2=convertUpperCase(name);
		
		System.out.println("Length is "+result_1);
		System.out.println("UpperCase is "+result_2);
		
		scan.close();
	}
	
	private static int getLength(String name){
		int stringLength = name.length();
		return stringLength;
	}
	private static String convertUpperCase(String name){
		String upperCase = name.toUpperCase();
		return upperCase;
	}
	}

