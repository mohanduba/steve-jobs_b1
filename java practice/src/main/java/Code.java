import java.util.Scanner;

public class Code {

	public static void main(String[] args) {
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operator :");
		String ope = sc.nextLine();	
		System.out.println("Enter FirstNum :");
		int a = sc.nextInt();
		System.out.println("Enter SecondNum :");
		int b = sc.nextInt();
		
		
		switch(ope){
			case "+" : 
				result=a+b;
				System.out.println("Addition :"+(result));
			break;
		
		
			case "-" : 
				result=a-b;
				System.out.println("Subtraction :"+(result));
			break;
			
			case "*" : 
				result=a*b;
				System.out.println("Multiplication :"+(result));
			break;
			
			case "/" : 
				result=a/b;
				System.out.println("Division :"+(result));
			break;
		
			
			default :  
				System.out.println("Not Valid");
		}
		
		
		
		
		
}
}