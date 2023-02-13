import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Questions_44 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\program1\\fi.txt"))) {
            String currentLine = bufferedReader.readLine();
            while (currentLine != null) {
                String[] words = currentLine.toLowerCase().split(" ");
                for (String word : words) {
//                    Integer count=hashMap.get(word);
                    if (!word.isBlank()) {
                        if (hashMap.containsKey(word)) {
                            hashMap.put(word, hashMap.get(word) + 1);
                        } else {
                            hashMap.put(word, 1);
                        }
//                        if (count==null){
//                            hashMap.put(word,1);
//                        }else {
//                            hashMap.put(word,++count);
//                        }
                    }
                }
                currentLine = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        hashMap.forEach((k, v) -> System.out.println(k + "=" + v));
        Map<String, Integer> maxMap = new HashMap<>();
        hashMap.entrySet()
                        .stream()
                            .filter(entry -> Objects.equals(entry.getValue(), Collections.max(hashMap.values())))
                                                     .forEach(e -> maxMap.put(e.getKey(), e.getValue()));
        System.out.println("-----------------");
        System.out.println(maxMap);

    }

}
