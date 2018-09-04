import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name="";
		
		System.out.println("Please enter your name");
		name = scan.nextLine();
		
		System.out.println("Upper Case Name 				: "+name.toUpperCase());
		System.out.println("Lower Case Name 				: "+name.toLowerCase());
		System.out.println("Substring Name 					: "+name.substring(0, 3));
		System.out.println("Index Name 						: "+name.charAt(6));
		System.out.println("Replaced  Name 					: "+name.replaceAll("e","w"));
		System.out.println("Name Comparison 				: "+name.compareTo("KanchanBhagwat"));
		System.out.println("Name Comparison ignore cases	:"+name.compareToIgnoreCase("kanchanbhagwat"));
		scan.close();
	}

}
