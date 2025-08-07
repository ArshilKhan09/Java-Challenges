import java.util.Scanner;

public class STATIC {  
    public static void main(String[] args) {
        printNumber();
    }      

    public static void printNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int input = sc.nextInt();
        System.out.println(input);
        sc.close();
    }
}
