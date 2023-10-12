import java.util.Scanner;

public class CharacterMain {
    public static void main(String[] args) {
    	int choice=1;
        Scanner scanner = new Scanner(System.in);
        while(choice==1) {
        System.out.print("Enter a string: ");
        String inputString = scanner.next();

        int length = calculateStringLength(inputString);
        System.out.println("Length of the string: " + length);
    
        System.out.println("enter the choice :: ");
        choice=scanner.nextInt();
    }
        System.out.println("Exit the program :: ");
    }

    public static int calculateStringLength(String str) {
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }
}