import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int numofDice;
        int total = 0;

        System.out.print("Enter the number of Dice to roll : ");
        numofDice = input.nextInt();

        if (numofDice > 0 ){
            for (int i = 0 ; i < numofDice ; i++){
                int roll = random.nextInt(1,7);
                dicePattern(roll);
                System.out.println("You rolled : "+ roll);
                total += roll ;
            }
            System.out.println("Total : "+total);
        }
        else {
            System.out.println("Number of Dice must be Greater than 0 .");
        }
        input.close();
    }
    static void dicePattern(int roll){
        String dice1 = """
               -----------
               |         |
               |    ●    |
               |         |
               -----------
                """;

        String dice2 = """
               -----------
               |  ●      |
               |         |
               |      ●  |
               -----------
                """;

        String dice3 = """
               -----------
               |  ●      |
               |    ●    |
               |      ●  |
               -----------
                """;

        String dice4 = """
               -----------
               | ●     ● |
               |         |
               | ●     ● |
               -----------
                """;

        String dice5 = """
               -----------
               | ●     ● |
               |    ●    |
               | ●     ● |
               -----------
                """;

        String dice6 = """
               -----------
               | ●     ● |
               | ●     ● |
               | ●     ● |
               -----------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Invalid roll");




        }
    }
}
