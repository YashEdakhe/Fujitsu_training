package day7;



public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=args[0];
		
		int num=Integer.parseInt(str1);
		//Scanner scan = new Scanner(System.in);
		//num=scan.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num==0)
		{
		System.out.println("number is zero");	
		}
		else
		{
			System.out.println("number is negative");
		}
	//	scan.close();
	}

}
