import java.util.Scanner;

public class PrintNextTenNumbers {
    public static void main (String args[]){
        // create scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Print statement to enter first number
        System.out.println("Enter first number : ");
        int firstNumber = scanner.nextInt();

        int secondNumber = firstNumber+10;

        for (int i = firstNumber; i <=secondNumber ; i++) {
            System.out.print(i+" ");
        }
    }


}
