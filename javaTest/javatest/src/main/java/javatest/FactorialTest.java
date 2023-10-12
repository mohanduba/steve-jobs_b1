package javatest;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {
		System.out.println("Enter a value: ");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact=1,i;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of an Integer:"+fact);
	}

}
