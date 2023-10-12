import java.util.Scanner;

public class BiggestNumMain {
    public static void main(String[] args) {
    	int choice=1;
        Scanner scanner = new Scanner(System.in);
        while(choice==1) {
        

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = findMax(arr);
        System.out.println("The biggest number in the array is: " + max);
        System.out.println("enter the choice :: ");
        choice=scanner.nextInt();
            }
        System.out.println("Exit the program :: ");
    }

    public static int findMax(int[] arr) {
        //if (arr.length == 0) {
            //return (Integer) null;
        //}

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
