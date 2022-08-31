public class Calculator {
    public static void Addition(int a, int b){
        System.out.println(a+ " + "+b+" = "+(a+b));
    }
    public static void Subtraction(int a, int b){
        System.out.println(a+" - "+b+" = "+(a-b));
    }
    public static void Multiplication (int a, int b){
        System.out.println(a+" x "+b+" = "+(a*b));
    }
    public static void Division (int a, int b){
        System.out.println(a+"/"+b+ " = "+(a/b));
    }
    public static void Addition(double a, int b){
        System.out.println(a+ " + "+b+" = "+(a+b));
    }

    public static void main (String args[]){
        Addition(9,3);
        Addition(5,15);
        Multiplication(5,3);
        Subtraction(7,2);
        Division(25,5);
        Addition(7.5,5);
    }
}
