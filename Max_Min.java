public class Max_Min {
    public static void main(String[] args) {
        int[] newArray = ArrayUtility.inputArray();
        int max = max(newArray);
        int min = min(newArray);
        
        System.out.println("The Maximum number in the Array is "+max);
        System.out.println("The Minimum number in the Array is "+min);
    }

    public static int max(int[] newArray) {
         if (newArray.length == 0) {
            return Integer.MIN_VALUE;
        }
        int i = 1 ;
        int max = newArray[0] ;
        while (i < newArray.length) {
              if( max < newArray[i]) {
                  max = newArray[i];               
                } 
             i ++ ;
        }
        return max ;
    } 



    public static int min(int[] newArray){
        int i = 1 ;
        int min = newArray[0] ;
        while(i < newArray.length){
         if ( min > newArray[i]){
              min = newArray[i];
            } 
         i ++ ;
        }
        return min ;
    }
}
