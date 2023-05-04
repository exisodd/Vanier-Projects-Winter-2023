package test2;

import java.util.Scanner;

public class QuadraticEquationExample1 {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 0, c = 0;
        try {
            System.out.print("Enter the value of a: ");
            a = Double.parseDouble(input.nextLine());
            System.out.print("Enter the value of b: ");
            b = Double.parseDouble(input.nextLine());
            System.out.print("Enter the value of c: ");
            c = Double.parseDouble(input.nextLine());
            double d = b * b - 4.0 * a * c;
            if (d > 0.0) {
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (d == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("Roots are not real.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number. The number should not be a " +
                    "string, char, or special character. You should enter a number.");
            System.out.println("Invalid argument: " + e.getMessage());
        } finally {
            input.close();
        }

    }
}
