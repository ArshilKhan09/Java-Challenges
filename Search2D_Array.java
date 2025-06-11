import java.util.Scanner;
public class Search2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input 2d array from user by utility method
        int[][] twoD_Array = ArrayUtility.input2DArray();

        // New scanner for input the number to search from user
        System.out.print("Enter the number that you want to Search :");
        int num = input.nextInt();

        // checking the number was found in the array or not by isFound method
        boolean isfound = isFound(twoD_Array, num);
        if (isfound) {
            System.out.println("Your Number was Found in 2D Array");
        } else {
             System.out.println("Your Number was Not Found in 2D Array");
        }
        input.close();
    }
     // method to find the number in the 2D Array
    public static boolean isFound(int[][] twoD_Array,int num){

        // outside loop for i 
        int i = 0 ;
        while (i < twoD_Array.length) {
            // inside loop for j
            int j = 0 ;
            while (j < twoD_Array[i].length) {
                if (twoD_Array[i][j] == num) {
                    return true ; // if 
                }
                j++ ; // j will increment only if the condition not satisfy 
            }
            i++ ; // i will increment everytime wheter the condition satisfy or not
        }
        return false ;
    }
}
