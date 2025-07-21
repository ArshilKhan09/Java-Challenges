import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] questions = {"Where was the Java Language developed ?",
                              "Who Developed Java Language ?",
                              "In which year Java Language was developed ?",
                              "What was the First name of Java ?",
                              "What Makes Java Different from other Languages ?"};

        String[][] options = {{"1. Microsoft" , "2. NASA" , "3.Sun Microsystem" , "Google"},
                              {"1. James Gosling" , "2. Mark Fedrick" , "3. Donald Trump" , "4. Steve Jobs"},
                              {"1. 1999" , "2. 1890" , "3. 1995" , "4. 1990"},
                              {"1. Coffee" , "2. Oak" , "3. Lava" , "4. Mock"},
                              {"1. Easy" , "2. OOPS Concept" , "3. FAST" , "4. All of the above"}};

        int [] answers = {3,1,3,2,4};   
        int score = 0 ;
        int guess ;
        
        for(int i = 0 ; i <questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i] ){
                System.out.println(option);
            }

            System.out.print("Enter your answer :");
            guess = input.nextInt();

            if (guess == answers[i]) {
                System.out.println("...Correct Answer...");
                System.out.println();
                score++;
            }
            else{
                System.out.println("...Wrong Answer...");
                System.out.println();

            }

        }
            System.out.println("Your Final Score is : "+score+" out of "+questions.length);
        input.close();
    }
}
