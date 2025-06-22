import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What item would you like to buy ?:");
        String item = input.next();
        System.out.print("What is the price for each ?:");
        double price = input.nextDouble();
        System.out.print("How many would you like ?");
        int quantity = input.nextInt();
        double total = price * quantity;

        System.out.println("You have bought "+ quantity +" "+ item +"'s");
        System.out.println("Your total is $"+total);

        input.close();
    }
}
