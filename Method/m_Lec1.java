package Method;

import java.util.Scanner;

public class m_Lec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second Number : ");
        int b = sc.nextInt();

        int sum = addition(a, b);
        System.out.print("The sum of two Number is "+sum);
    }


    static int addition(int x , int y){
        int sum = x+y;
        return sum;
    }
}
