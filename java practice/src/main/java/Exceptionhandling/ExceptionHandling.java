package Exceptionhandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println(1/0);
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException ::");
		}finally {
			System.out.println("Finally block ::");
		}
		
		
	}

}
