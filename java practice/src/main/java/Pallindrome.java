import java.util.Scanner;

public class Pallindrome {
	static int r,sum=0,n,temp,m;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		System.out.println("Enter Input::");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		pallindromeMethod(n);
		
		System.out.println("If you want to continue click'1' or '2' to Exit::");
		choice=sc.nextInt();
		while(true) {
		if(choice==1) {
			System.out.println("Enter Input::");
			n=sc.nextInt();
			pallindromeMethod(n);
			
		}
		else if(choice==2){
			System.out.println("Exit");
			break;
			
		}
		System.out.println("If you want to continue click'1' or '2' to Exit::");
		choice=sc.nextInt();
		}
		
	
	}
	private static void pallindromeMethod(int n) {
		temp=n;
		sum=0;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
	}
	System.out.println("Palindrome::"+sum);
	if(sum==temp) 
		System.out.println("Palindrome Number::");
	else 
		System.out.println("Not Palindrome Number::");
	
	
	}

}

