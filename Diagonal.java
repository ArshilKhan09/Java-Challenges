public class Diagonal {
    public static void main(String[] args) {
        int [][] element = ArrayUtility.input2DArray();

        long sum = sumofDiagonal(element);
        System.out.println("The sum of the Diagonal Element is : "+sum);

    }

    public static long sumofDiagonal(int [][] element){
        long leftSum = sumofLeftDiagonal(element);
        long rightSum = sumofRightDiagonal(element);

        long sum = leftSum + rightSum;

        if (element.length % 2 != 0) {
            int ind = element.length / 2 ; 
            sum -= element[ind][ind];
        }

        return sum ;
    }

    public static long sumofLeftDiagonal(int [][] element){
            int sum = 0 ;
            int i = 0 ;
            while (i < element.length) {
                sum += element[i][i];
            }
        return sum ;
    }

    public static long sumofRightDiagonal(int [][] element){
        long sum = 0 ;
        int i = 0 ;
        while (i < element.length) {
                int col = element.length - 1 - i;
                sum += element[i][col];
                i++ ;
        }
        return sum ;
    }
}
