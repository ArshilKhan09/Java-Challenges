import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] newArray = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            newArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to find the occurrence: ");
        int num = scanner.nextInt();

        int occurance = occurance(newArray, num);
        System.out.println("The occurrence of the given number is: " + occurance);

        scanner.close();
    }

    public static int occurance(int[] newArray, int num) {
        int occ = 0;
        for (int value : newArray) {
            if (value == num) {
                occ++;
            }
        }
        return occ;
    }
}
