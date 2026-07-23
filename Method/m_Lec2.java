package Method;

import java.util.Scanner;

public class m_Lec2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int y = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int z = sc.nextInt();

        avgerage(x,y,z);

    }
    static void avgerage(int a , int b , int c ){
        int avg = (a+b+c)/3;
        System.out.print("The average is "+avg);
    }
}
