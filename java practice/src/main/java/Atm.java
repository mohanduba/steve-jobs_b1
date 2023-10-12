import java.util.Scanner;

public class Atm {
	int amount;
	Scanner sc = new Scanner(System.in);
	void userData() {
		while(true) {
		System.out.println("Please Enter UserName and Password");
		String user_name = sc.next();
		String Password = sc.next();
	
		if(user_name.equals("Mohanrao") && Password.equals("mohan45")) {
			atmAmount();
			
			break;
		}else {
			System.out.println("enter valid Details");
			
		}
		}
		
		
	}
	void atmAmount() {
		
		System.out.println("Please Enter Amount");
		int amount = sc.nextInt();
		int input1,input2,input3,input4,input5,input6,input7,input8,input9;
		if(true) {
			input1=amount/2000;
			input2=2000*input1;
			input3=amount-input2;
			input4=input3/500;
			input5=500*input4;
			input6=input3-input5;
			input7=input6/100;
			input8=100*input7;
			input9=input6-input8;
			System.out.println("2000 Notes amount:"+input2);
			System.out.println("No Of 2000Notes :"+input1);
			System.out.println("500 Notes amount:"+input5);
			System.out.println("No Of 500Notes :"+input4);
			System.out.println("100 Notes amount:"+input8);
			System.out.println("No Of 100Notes :"+input7);
		}
		
		
	}
	
}
