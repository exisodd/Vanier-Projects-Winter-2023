package test2;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q2 {

    public static void main(String[] args) {
        LinkedHashSet<String> words = new LinkedHashSet<>();
        try {
            // File IO
            FileReader fileReader = new FileReader("src\\input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("src\\output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Read file line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split into array and add to Set to remove duplicates
                String[] lineWords = line.split(" ");
                words.addAll(Arrays.asList(lineWords));
                String result = String.join(" ", words);
                bufferedWriter.write(result);
            }

            // Close files
            bufferedReader.close();
            fileReader.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
