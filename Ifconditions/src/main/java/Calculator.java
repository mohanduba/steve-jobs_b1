import java.util.Scanner;
public class Calculator {
	
	void calciMethod() {
		System.out.println("Enter FirstNumber :");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter Operator :");
		String ope = sc.next();
		System.out.println("Enter SecondNumber :");
	
		int num2 = sc.nextInt();
		
		if(ope.equals("+")) {
			System.out.println("Addition :"+(num1+num2));
		}
		else if(ope.equals("-")) {
			System.out.println("Subtraction :"+(num1-num2));
		}
		else if(ope.equals("*")) {
			System.out.println("Multiplication :"+(num1*num2));
		}
		else if(ope.equals("/")) {
			System.out.println("Division :"+(num1/num2));
		}
	}

}
