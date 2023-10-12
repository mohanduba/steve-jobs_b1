import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
       Arrays.sort(charArray1);
       Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
    	int choice=1;
    
        Scanner scanner = new Scanner(System.in);
        while(choice==1) {
        
        System.out.println("Enter the first string: ");
        String str1 = scanner.next();
        
        System.out.println("Enter the second string: ");
        String str2 = scanner.next();
        
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
        System.out.println("enter the choice :: ");
        choice=scanner.nextInt();
        }
        System.out.println("Exit the program :: ");
}
}

