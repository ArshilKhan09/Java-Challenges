import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = inp.nextInt();
        boolean isPrime = isprime(num);
        if (isPrime){
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not Prime");
        }

        inp.close();
    }
    public static boolean isprime(int num){
          int i = 2 ;
          while (i < num){
          if(num % i == 0){
              return false;
          }
              i++;
          }
             return true ;
    }
}
