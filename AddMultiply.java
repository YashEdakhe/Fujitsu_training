import java.util.*;;

public class AddMultiply {
	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		
		Addition 	   add = new Addition();
		Multiplication multiplication = new Multiplication();
		int m = add.addition(x, y);
		int n = multiplication.multiply(x, y);
		System.out.println("Addition :" + m);
		System.out.println("Multiplication :" + n);
		scan.close();

	}

}
