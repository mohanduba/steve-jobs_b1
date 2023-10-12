import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,fact,input,b;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		 a = sc.nextInt();
		 fact=1;
		for(int i=1;i<=a;i++) {
			fact = fact*i;
		
		}
		System.out.println("Factorial of a:"+fact);
		System.out.println("Choose 1 to continue or Choose 2 to Exit ::");
		 b = sc.nextInt();
		while(true) {
		
		
		if(b==1) {
			
			 b = sc.nextInt();
			 factorial(b);
		}
		else if(b==2) {
			 
			System.out.println("Completed Successfully");
		}
		break;
		}
		
		
		
	}


 private static int factorial(int a) {
	int fact=1;
	
	for(int i=1;i<=a;i++) {
		fact = fact*i;
	
	}
	System.out.println("Factorial of a:"+fact);
	return fact;

}
}


