import java.util.Scanner;

public class AddName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the First name");
		String Name1 = sc.nextLine();
		System.out.println("Enter the second Name");
		String Name2 = sc.next();
		
		String FullName = Name1 + " " + Name2;

		System.out.println("After adding name will be : " + FullName);
	}

}
