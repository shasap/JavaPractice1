import java.util.Scanner;

public class FibonacciSeries {
    public static void FibonacciNumber(){
        int n1 = 0;
        int n2 = 1;
        int n3;
        int i;

        Scanner fibonacciNumber = new Scanner(System.in);
        System.out.println("Enter value to create series : ");
        int n = fibonacciNumber.nextInt();

        System.out.print(n1+ " "+n2 +" ");

        for (int j = 0; j <=n; j++) {
            n3 = n1 + n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }

    }
    public static void main(String args[]){
        FibonacciNumber();
    }
}
