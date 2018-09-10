import java.util.Scanner;

public class Message {
	
	public String msg;
	
	public Message(String msg)
	{
		this.msg = msg;
		System.out.println(msg);
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The String!");
		String msg = scan.nextLine();
		Message m1 = new Message(msg);
		scan.close();
		
	}

}
