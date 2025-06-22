public class printF {
    public static void main(String[] args) {

        String name = "Doraemon";
        char firstletter = 'D';
        int age = 21 ;
        double height = 41.4;
        boolean isEmployed = true ;
        System.out.printf("Hello %s \n",name);
        System.out.printf("Your Name Start's with %c\n",firstletter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("Your Height is %.2f cm\n",height);
        System.out.printf("You are Employed %b\n",isEmployed);
    }
}
