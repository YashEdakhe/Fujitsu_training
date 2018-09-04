import java.util.Scanner;

public class FindStringLength {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.println("Enter the name");
		name=scan.next();
		int length=findLength(name);
		System.out.println("string length is: "+length);
		scan.close();
		
		
	}

	private static int findLength(String name) {
		// TODO Auto-generated method stub
		int length=name.length();
		return length;
	}

}
