class sort_Array {
    public static void main(String[] args) {
        int[] sortArray = ArrayUtility.inputArray();
        boolean isIncreasing = isIncreasing(sortArray);
        boolean isDecreasing = isDecreasing(sortArray);
        if (isIncreasing || isDecreasing) {
            System.out.println("Your Array is Sorted");
        }
        else{
            System.out.println("Your Array is Not Sorted");
        }
    }
    public static boolean isIncreasing(int[] sortArray) {
        int i = 1 ;
        
        while (i < sortArray.length) {
            if (sortArray[i] < sortArray[i-1] ) {
                return false ;
            }
            i++ ;
        }
        return true ;
    }

     public static boolean isDecreasing(int[] sortArray) {
         int i = 1 ;
        
        while (i < sortArray.length) {
            if (sortArray[i] > sortArray[i-1] ) {
                return false ;
            }
            i++ ;
        }
        return true ;
    }
}
