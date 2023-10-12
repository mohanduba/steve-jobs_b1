import java.util.Scanner;
 class FactorialOne {
public static void main(String[ ] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Please enter input :: ");
int a = sc.nextInt();

factorial(a);


  while(true) {
	  System.out.println("If you want to continue enter 1::");
	  int choice=sc.nextInt();
	  System.out.println("Given choice is ::");
	  if(choice==1) {
		  System.out.println("Enter input ::");
		     int input = sc.nextInt();
             factorial(input);
		  }
	  else if(choice==2) {
		   System.out.println("program exit");
		   break;   
	  }
  }  
}

private static void factorial(int a) {
	int fact=1;
	for (int i=2;i<=a;i++) {
		fact=fact*i;
}
	System.out.println("Factorial of a:"+fact);
}
}

