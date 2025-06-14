import java.util.Random;
import java.util.Scanner;

public class numberGuess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(0,100);
        int number ;

        do {
             System.out.print("Guess the Number : ");
              number = input.nextInt();
            if (number > num){
                System.out.println("Go Down");
            }
            else if (number < num){ 
                System.out.println("Go Up");
            } else {
                System.out.println("Number Found");
            }
            
        } while (number!=num);
        input.close();
    }
 }

