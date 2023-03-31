package exercises;
import java.util.Scanner;
public class SwitchStatement {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day: ");
        String day = input.nextLine();
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("Blehhh… I mean, Mondays are Great!");
                break;
            case "friday":
                System.out.println("Guess what? It’s Fridayyyyyyy.");
                break;
            case "sunday":
                System.out.println("Wait, the weekend is almost over!?");
                break;
            default:
                System.out.println("Happy whatever day today is!");
                break;
        }

    }
}
