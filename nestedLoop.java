import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int rows = input.nextInt();
        System.out.print("Enter Number of Columns : ");
        int columns = input.nextInt();
        System.out.print("Enter the symbol : ");
        char symbol = input.next().charAt(0);

        for (int i = 1 ; i <= rows ; i++) {
            for (int j = 1 ; j <= columns ; j ++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
