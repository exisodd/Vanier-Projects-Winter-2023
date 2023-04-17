package assignment2;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task7 {
    public static void main(String[] args) {
        String inputFile = "src\\assignment2\\input.txt";
        String outputFile = "src\\assignment2\\output.txt";
        try {
            // Initialize file reader
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            LinkedHashSet<String> uniqueWords = new LinkedHashSet<>();

            String line;
            int start = 0;
            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                // Convert line in text file to LinkedHashSet
                // to remove duplicates and retain insertion order
                System.out.println("Original sequence: " + line);
                String[] words = line.split(" ");

                // Convert LinkedHashSet back to words separated by spaces
                uniqueWords.addAll(Arrays.asList(words));
                String result = toString(uniqueWords, start);
                System.out.println("No duplicates: " + result);
                start = uniqueWords.size();
                bufferedWriter.write(result);
            }

            bufferedWriter.close();
            fileReader.close();
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String toString(LinkedHashSet<String> words, int start) {
        // Helper function that  returns a string using delimiter " " from start
        // index to end. Keeps track of newlines at the string
        StringBuilder s = new StringBuilder();
        int index = 0;
        for (String word : words) {
            if (index++ >= start) {
                s.append(word).append(" ");
            }
        }
        s.append("\n");
        return s.toString();
    }
}
