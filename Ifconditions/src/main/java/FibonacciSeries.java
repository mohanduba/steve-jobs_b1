import java.util.Scanner;
public class FibonacciSeries {
public static void main(String[]args) {
	System.out.println("Enter a Value:");
Scanner sc = new Scanner(System.in);
int input = sc.nextInt();
int num1=0,num2 =1,num3;
System.out.print("Fibonacci Series : ");
System.out.print(num1+" "+num2+" ");

for(int i=2;i<=input;i++) {
	num3=num1+num2;
	num1=num2;
	num2=num3;
	
	System.out.print(num3+" ");
}

}
}
