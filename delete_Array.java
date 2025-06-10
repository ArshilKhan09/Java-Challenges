import java.util.Scanner;

public class delete_Array {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the Number of Element in Array :");
        int size = number.nextInt();
        int[] numArray = new int[size];
        int i = 0 ;
        while (i < size) {
         System.out.print("Please enter the element no " + (i+1) + ": ");
         numArray[i] = number.nextInt();
         i++;
        }

        System.out.println("Enter the number that you want to delete : ");
        int numTodelete = number.nextInt();

        int[] newArr = deleteNumber(numArray, numTodelete);

       System.out.println("Array After Deleting "+numTodelete+ " the New Array is : ");
       int Display = displayArray(newArr);

       number.close(); 
    }

    public static int displayArray(int[] numArray){
        int i = 0 ;
        while (i<numArray.length) {
            System.out.println(numArray[i]+ " ");
            i++;
        }
        System.out.println();
        return i ;
    }

    public static int[] deleteNumber(int[] numArray,int numTodelete){
        int occ = Occurence.occurance(numArray, numTodelete);
        if (occ == 0 ) {
            return numArray;
        }
           int newSize = numArray.length-occ; 
           int[] newArr = new int[newSize];

           int i = 0 , j = 0 ;
           while (i < numArray.length) {
               if (numArray[i] != numTodelete) {
                    newArr[j] = numArray[i];
                    j++ ;
               }
               i++ ;
           }

           return newArr ;
    }
}