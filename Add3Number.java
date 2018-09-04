import java.util.Scanner;

public class Add3Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNumber, secondNumber, thirdNumber;
		System.out.println("Enter the first number - ");
		firstNumber = scan.nextInt();
		System.out.println("Enter the Second number - ");
		secondNumber = scan.nextInt();
		System.out.println("Enter the Third number - ");
		thirdNumber = scan.nextInt();
		
		System.out.println(getAdd3Number(firstNumber, secondNumber, thirdNumber));
		scan.close();
	}

	private static int getAdd3Number(int firstNumber, int secondNumber, int thirdNumber) {

		return firstNumber + secondNumber + thirdNumber;
	}

}
