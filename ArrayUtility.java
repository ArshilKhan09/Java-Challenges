import java.util.Scanner;

public class ArrayUtility{
    public static int[] inputArray(){
         Scanner number = new Scanner(System.in);
        System.out.print("Enter the number of Element : ");
        int size = number.nextInt();
        int[] arr = new int[size];        
        int i = 0 ;
        while (i < size) {
         System.out.print("Please enter the number " + (i+1) + ": ");
         arr[i] = number.nextInt();
         i++;
        }
        number.close();
        return arr ;
    }
}