package test2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input : ");
        String word = console.nextLine();

        char[] chars = word.toCharArray();
        int sum = IntStream.range(0, chars.length).mapToObj(i -> chars[i]).mapToInt(c -> (int) c).sum();
        System.out.println("Sum: " + sum);
    }
}
