import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = number.nextInt();
        System.out.println("The fibonacci series of "+num+" is :");
        fibonacci(num);

        number.close();
    }
    public static void fibonacci(int num){
       if (num < 0) return;
        System.out.print("0 ");
       if (num == 0) return;
        System.out.print("1 ");

        int first = 0 , second = 1 ;
       while (first+second <= num){
           int third = first+second ;
           System.out.print(third+" ");
           first = second ;
           second = third;
       }
    }
}
