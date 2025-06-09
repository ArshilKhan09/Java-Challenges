public class sum_avg{
    public static void main(String[] args) {
       int[] numArray = ArrayUtility.inputArray();
       long sum = sum(numArray);
       int avg = avg(numArray);

       System.out.println("The Sum of the Array is : "+sum);
       System.out.println("The Average of the Array is : "+avg);

    }

    public static long sum(int[] numArray ){
        long sum = 0 ;
        int i = 0;
        while (i < numArray.length){
            sum += numArray[i];
            i++ ;
        }
        return sum ;
    }

    public static int avg(int[] numArray ){
        long sum = sum(numArray);
        int avg = (int)sum/numArray.length;
        return avg ;
    }
}