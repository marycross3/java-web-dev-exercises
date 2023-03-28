package exercises;
import java.util.Scanner;

public class AreaOfRect {
    public static void main (String[] args) {
        double length;
        double width;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = input.nextDouble();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = input1.nextDouble();

        area = length * width;
        System.out.println("The area is "+ area);


    }
}
