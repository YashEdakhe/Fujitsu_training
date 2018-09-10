import java.util.Scanner;

public class MethodCalling {

	int Employee_id;
	String Employee_name;

	public void enterData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Employee ID and Name");
		Employee_id = scan.nextInt();
		Employee_name = scan.next();
		scan.close();
	}

	public void showData() {
		System.out.println("Employee ID :-" + Employee_id);
		System.out.println("Employee name:-" + Employee_name);
	}
	
	public static void main(String args[]) {
		MethodCalling mc = new MethodCalling();
		mc.enterData();
		mc.showData();
	}
}

