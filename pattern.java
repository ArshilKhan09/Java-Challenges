import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Number of Rows : ");
        int row = input.nextInt();
        firstPattern(row);
        secondPattern(row);
        thirdPattern(row);

        input.close();
    }
    public static void thirdPattern(int maxRow) {
        System.out.println("\nThird Pattern :- Left Half Pyramid");
        int row = maxRow;
        while (row > 0) {
            int j = 0;
            while (j < row - 1) {
                System.out.print("  ");
                j++;
            }
            int i = 0;
            while (i <= (maxRow - row)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }
    public static void secondPattern(int maxRow) {
        System.out.println("\nSecond Pattern :- Reverse Half Pyramid");
        int row = maxRow;
        while (row > 0) {
            int i = 0 ;
            while (i < row){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            row--;
        }
    }
    public static void firstPattern(int maxRow) {
        System.out.println("\nFirst Pattern :- Right Half Pyramid");
        int row = 0 ;
        while (row < maxRow){
            System.out.print("*");
            int i = 0 ;
            while (i < row){
                System.out.print(" *");
                i++ ;
            }
            System.out.println();
            row++;
        }
    }
}
