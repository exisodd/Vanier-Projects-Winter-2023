package test2;

import java.util.Scanner;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input : ");
        String line = console.nextLine();
        Stack<Character> chars = new Stack<>();
        Stack<Character> nonChars = new Stack<>();
        System.out.println(line);
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isAlphabetic(c)) {
                chars.push(c);
            } else {
                nonChars.push(c);
            }
        }

        String s = "";
        while (!nonChars.isEmpty()) {
            s = String.format("%c%s", nonChars.pop(), s);
        }
        while (!chars.isEmpty()) {
            s = String.format("%c%s", chars.pop(), s);
        }
        System.out.println("Output: " + s);
    }
}
