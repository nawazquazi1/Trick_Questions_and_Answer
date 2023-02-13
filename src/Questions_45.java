import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Questions_45 {
    public static void main(String[] args) {
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\program1\\fi.txt"))) {
            String currLine = reader.readLine().trim();
            while (currLine != null) {
                if (!currLine.isBlank()) {
                    lineCount++;
                }
                //words
                String[] words = currLine.split(" ");
                wordCount = wordCount + words.length;

                for (String word : words) {
                        charCount = charCount + word.trim().length();
                    }

                currLine = reader.readLine();
            }
            System.out.println("Total line :- " + lineCount);
            System.out.println("Total words :- " + wordCount);
            System.out.println("Total chars :- " + charCount);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
