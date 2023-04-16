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
            String line;

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Original sequence: " + line);
                // Convert line in text file to LinkedHashSet to remove duplicates and retain insertion order
                String[] words = line.split(" ");
                LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

                // Convert LinkedHashSet back to words separated by spaces
                String result = String.join(" ", uniqueWords) + "\n";
                System.out.println("No duplicates: " + result);
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
}
