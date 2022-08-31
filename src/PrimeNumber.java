import java.util.Scanner;

public class PrimeNumber {
public static void main(String args[]){
    Scanner numberCheck = new Scanner(System.in);
    System.out.println("Enter number to check if it is prime : ");
    int number = numberCheck.nextInt();
    boolean IsPrime = true;

    for (int i = 2; i <number/2 ; i++)
    {
        if (number%i == 0)
        {
            IsPrime = false;
            break;
        }
    }
    if(IsPrime){
        System.out.println(number+" is a prime number.");
    }else{
        System.out.println(number+" is not a prime number");
    }
}
}
