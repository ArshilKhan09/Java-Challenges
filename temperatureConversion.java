import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the temperature in Farenhite : ");
        float farenhite = input.nextFloat();
        double celcius = (farenhite-32) * 5/9 ;

        System.out.println(farenhite+" farenhite equals to "+celcius+ " celcius");

        input.close();
    }
}
