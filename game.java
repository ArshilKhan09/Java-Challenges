import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] choices ={"rock" , "paper" , "scissor"};
        String playerchoice ;
        String computerchoice ;
        String playAgain = "yes";

        System.out.print("Enter Your Move (rock , paper , scissor) : ");
        playerchoice = input.nextLine().toLowerCase();

        if (!playerchoice.equals("rock") &&
            !playerchoice.equals("paper") &&
            !playerchoice.equals("scissor")) {
            System.out.println("Invalid Choice ");
        }

        computerchoice=choices[random.nextInt(3)];
        System.out.println("Computer Choice : "+computerchoice);


        if (playerchoice == computerchoice) {
            System.out.println("Its a Tie ");
        }
        else if(playerchoice.equals("rock") && computerchoice.equals("scissor")){
            System.out.println("You Win ");
        }
        else if(playerchoice.equals("scissor") && computerchoice.equals("paper")){
            System.out.println("You Win ");
        }
         else if(playerchoice.equals("paper") && computerchoice.equals("rock")){
            System.out.println("You Win ");
        }
        else {
            System.out.println("You Lose ");

        }

        input.close();
    }
}
