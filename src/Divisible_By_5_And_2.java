public class Divisible_By_5_And_2 {

    public static void Divisible_By_5(){
        System.out.println("Numbers Divisible by 5 between 1 to 150 are as follows");

        for ( int i = 1; i <= 150 ; i++) {
            if (i%5 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void Divisible_By_6(){
        System.out.println("Numbers Divisible by 2 between 1 to 200 are as follows");

        for ( int i = 1; i <= 200 ; i++) {
            if (i%6 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void Divisible_2_And_5(){
        System.out.println("Numbers Divisible by 2 and 5 both between 1 to 200 are as follows");
        for (int i = 1; i <= 200 ; i++) {
            if (i%2 == 0 && i%5 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Divisible_By_6();
        System.out.println("-------------------------------------------------------------------------------------");
        Divisible_By_5();
        System.out.println("-------------------------------------------------------------------------------------");
        Divisible_2_And_5();

    }
}
