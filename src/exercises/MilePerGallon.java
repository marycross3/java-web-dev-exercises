package exercises;
import java.util.Scanner;
public class MilePerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles drive: ");
        Double milesDriven = input.nextDouble();

        System.out.println("Enter amount of gas consumed in gallens: ");
        Double gasInGallons = input.nextDouble();

        Double milesPerGal = milesDriven/gasInGallons;
        System.out.println("Miles per gallon "+ milesPerGal);
    }
}
