import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in); 

        System.out.print("Enter the number for multiplication Table: ");
        int num = number.nextInt(); 

        int result = multi(num);

        System.out.println(result); 

        number.close();
    }

    public static int multi(int num) {
        int i = 1;

        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++; 
        }

        return i; 
    }
}
