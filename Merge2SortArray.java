
public class Merge2SortArray {
    public static void main(String[] args) {

        // Taking Two Array as Input from the user 
        int[] array1 = ArrayUtility.inputArray(); // Pass scanner

        int[] array2 = ArrayUtility.inputArray(); // Pass scanner
        // Calling Merge method 
        int[] mergeArray = merge(array1, array2);

        //displaying the new Merged array
        System.out.println("Your Merged Array is :");
        delete_Array.displayArray(mergeArray);

    }

    //Merge method of merging two sorted array
    public static int[] merge(int[]array1,int[]array2){
        int newSize = array1.length + array1.length ; // size of the new array will be the length of both the array
        int[] newArr = new int[newSize]; // creating the new Array by giving its size 
        int i = 0 , j = 0 , k = 0 ;  // initializing three pointer ( i = array1 , j = array2 , k = newArr) 

        // Loop wil continue till i < array1.length or j < array2.length (because both the array size will be different )
        while (i < array1.length || j < array2.length) { 
            if (j == array2.length ||   // if j reach at last index of array2 then check that i reach at last index of array2
                    (i < array1.length && array1[i] < array2[j])) { // if i reach at last index of array1 &&  if the array1[i] < array2[j] then the array1[i] will be initialize to newArr[k]
                newArr[k] = array1[i] ;
                i++;  // everytime i for array1 will increment if condition satisfy
                k++;  // k wil increment everytime wheter the condition is true or false
            } else {
                newArr[k] = array2[j] ;
                j++;  // everytime j for array2 will increment if above condition not satisfy
                k++;  // k wil increment everytime wheter the condition is true or false
            }
        }

        return newArr; // newArr will be returned  
    }
}
