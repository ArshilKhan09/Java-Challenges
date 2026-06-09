import java.util.Scanner;

public class arr {     
    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i+1;
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}