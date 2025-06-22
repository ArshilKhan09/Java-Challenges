import java.util.Scanner;
public class weight {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Option 1 : convert Lbs to Kgs");
        System.out.println("Option 2 : convert Kgs to Lbs");
        System.out.print("Choose an Option : ");
        
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in Lbs : ");
            double weight = input.nextDouble(); 
            double newWeight = weight * 0.453592 ;
            System.out.printf("The weight in Kgs is : %.2f",newWeight);
        }
        else if (choice == 2) {
            System.out.print("Enter the weight in Kgs : ");
            double weight = input.nextDouble();
            double newWeight = weight * 2.20462;
            System.out.printf("The weight in Lbs is : %.2f",newWeight);

        } 
        else {
            System.out.println("The Option is Invalid , Choose the correct Option ");
        }

        input.close();
    }
}