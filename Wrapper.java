public class Wrapper {
   
    public static void main(String[] args) {
        int a = 10;  // primitive data type

        // Wrapping primitive into object (Boxing)
        Integer obj = Integer.valueOf(a);  

        // Unwrapping object to primitive (Unboxing)
        int b = obj.intValue();  

        System.out.println("Primitive value: " + a);
        System.out.println("Wrapped object: " + obj);
        System.out.println("Unwrapped value: " + b);
    }
}
