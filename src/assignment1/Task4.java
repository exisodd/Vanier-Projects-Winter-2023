package assignment1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] changeNamesSl = {"half-dollar", "quarter", "dime", "nickel", "penny"};
        String[] changeNamesPl = {"half-dollars", "quarters", "dimes", "nickels", "pennies"};
        System.out.print("Enter change in cents: ");
        int cents = console.nextInt();
        int[] change = findChange(cents);
        for (int i = 0; i < changeNamesSl.length; i++) {
            if (change[i] > 0) {
                System.out.printf("%d %s%s ", change[i], (change[i] == 1) ? changeNamesSl[i] : changeNamesPl[i],
                                 (i == changeNamesSl.length - 1) ? "." : ",");
            }
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
