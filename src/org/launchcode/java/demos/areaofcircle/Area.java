package org.launchcode.java.demos.areaofcircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double radius;
        do {
            System.out.println("Enter a radius: ");

            while (!input.hasNextDouble() ) {
                System.out.println("That is not a number!");
                System.out.println("Enter a radius: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0 );
            System.out.println("The area of a circle of radius "+ radius +
                    " is: " + Circle.getArea(radius));
    }
}
