import java.util.Scanner;
public class Search2D_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] twoD_Array = ArrayUtility.input2DArray();
        System.out.print("Enter the number that you want to Search :");
        int num = input.nextInt();
        boolean isfound = isFound(twoD_Array, num);
        if (isfound) {
            System.out.println("Your Number was Found in 2D Array");
        } else {
             System.out.println("Your Number was Not Found in 2D Array");
        }
        input.close();
    }

    public static boolean isFound(int[][] twoD_Array,int num){
        int i = 0 ;
        while (i < twoD_Array.length) {
            int j = 0 ;
            while (j < twoD_Array[i].length) {
                if (twoD_Array[i][j] == num) {
                    return true ;
                }
                j++ ;
            }
            i++ ;
        }
        return false ;
    }
}
