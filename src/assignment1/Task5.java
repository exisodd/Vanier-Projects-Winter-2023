package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // User day input
        System.out.println("1: Mon 2: Tue 3: Wed");
        System.out.println("4: Thu 5: Fri 6: Sat");
        System.out.println("7: Sun\n");
        System.out.printf("%-22s", "Which day are we?");
        int day = console.nextInt();
        console.nextLine();

        // People input
        int person = 0;
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            System.out.printf("%-22s", "How old is person " + ++person + "?");
            int age = console.nextInt();
            console.nextLine();
            ages.add(age);
            System.out.printf("%-22s", "Another person?");
            String anotherPerson = console.nextLine();
            if (anotherPerson.equalsIgnoreCase("N")) break;
        }

        // Compute result
        System.out.printf("People count:%10d\n", person);
        int price = computePrice(ages, day);
        System.out.printf("Total is:%14s", "$" + price);
    }

    public static int computePrice(ArrayList<Integer> ages, int day) {
        int total = 0;
        for (int age: ages) {
            switch (day) {
                case 1:
                case 2:
                case 3:
                case 4:
                    if (age >= 18) {
                        total += 20;
                    } else {
                        total += 15;
                    }
                    break;
                case 5:
                    if (age >= 18) {
                        total += 30;
                    } else {
                        total += 25;
                    }
                    break;
                case 6:
                case 7:
                    if (age >= 18) {
                        total += 40;
                    } else {
                        total += 35;
                    }
            }
        }
        return total;
    }
}
