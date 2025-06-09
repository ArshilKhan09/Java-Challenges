import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = inp.nextInt();
        int reverse = reverse(num);
        System.out.println("The reverse of the number is : "+reverse);

        inp.close();
    }
    public static int reverse(int num){
        int sum = 0 ;
        while (num > 0){
            int digit = num % 10 ;
            sum = sum * 10 + digit;
            num /= 10 ;
        }
        return sum ;
    }
}
