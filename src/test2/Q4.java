package test2;

import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input : ");
        String word = console.nextLine();

        Queue<Character> repeatChars = new LinkedList<>();
        HashMap<Character, Integer> charCount = new HashMap<>();

        // Loop over every char
        for (int i = 0; i < word.length(); i++) {

            char c = word.charAt(i);
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }

        // Loop over every key, and enqueue if element already exists
        for (Character c: charCount.keySet()) {
            if (charCount.get(c) > 1) {
                repeatChars.offer(c);
            }
        }

        String s = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            // If element is already in queue
            boolean alreadyContains = false;
            for (int j = 0; j < repeatChars.size(); j++) {
                char ch = repeatChars.poll();
                repeatChars.offer(ch);
                if (ch == c) {
                    alreadyContains = true;
                    break;
                }
            }
            // If element has no duplicates, add to string
            if (!alreadyContains) {
                s += c;
            }
        }

        // Now add repeat elements of queue back onto string
        String repeats = "";
        while (!repeatChars.isEmpty()) {
            repeats = String.format("%c%s", repeatChars.poll(), repeats);
        }
        s += repeats;

        System.out.println("Output: " + s);
    }
}
