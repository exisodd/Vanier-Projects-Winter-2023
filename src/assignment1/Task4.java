package assignment1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] changeNames = {"half-dollars", "quarters", "dimes", "nickels", "pennies"};
        System.out.print("Enter change in cents: ");
        int cents = console.nextInt();
        int[] change = findChange(cents);
        for (int i = 0; i < changeNames.length; i++) {
            System.out.printf("%d %s, ", change[i], changeNames[i]);
        }
    }

    public static int[] findChange(int cents) {
        int[] changeValues = {50, 25, 10, 5, 1};
        int[] change = new int[changeValues.length];
        for (int i = 0; i < changeValues.length; i++) {
            change[i] = cents / changeValues[i];
            cents %= changeValues[i];
        }
        return change;
    }
}
