import java.util.Scanner;

public class SumAvg2D_Array {
    public static void main(String[] args) {
        
     // Create a Scanner object to read input from the user
     Scanner number = new Scanner(System.in);
        

        // Ask the user how many elements they want in the array
        System.out.print("Enter the number of rows : ");
        int rows = number.nextInt();
        
        System.out.print("Enter the number of column : ");
        int column = number.nextInt();

        // Create an array of the specified size
        int[][] array = new int[rows][column];

         int i = 0; // Initialize index to start filling the array

        // Loop to take each element of the array from the user
        while (i < rows) {
            int j = 0;
            while (j < column) {
                System.out.print("Please enter the element of row " + (i+1) + " and column " + (j + 1) + ": ");
                array[i][j] = number.nextInt(); // Read and store each element
                j++;
            }
            
            i++; // Move to the next index
        }

        // method call and display the output
        long sum = sum(array);
        double avg = avg(array);
        System.out.println("The sum of the given Array is : "+ sum);
        System.out.println("The average of the given Array is : "+ avg);

        number.close();
    }

    // this is a method for adding all the element in an 2D Array 
    public static long sum(int[][] array){
        long sum = 0 ; 
        // Outerloop for i 
        int i = 0 ;
        while (i < array.length) {
            // Insideloop for j 
            int j = 0 ;
            while (j < array[i].length) { // if j is less than the Array Length then the below condition will run 
                sum += array[i][j];    // sum = sum + array [i][j]  (sum will store the previous value and add the next value to it)
                j++ ; // j will increment all 
            }
           i++ ; // i will increment everytime
        }

        return sum ;
    }

    public static double avg(int[][] array){
        if (array.length == 0 ) {
            return 0;
        }
        int rows = array.length ;
        int column = array[0].length ;
        double size = rows*column;

        return sum(array) / size ;
    }
}
