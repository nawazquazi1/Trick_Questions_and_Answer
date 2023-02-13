import java.util.Arrays;
import java.util.Locale;

public class Questions_49 {
    public static void main(String[] args) {

    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            char[] ch1 = str1.replaceAll("\\s+","").toLowerCase().toCharArray();
            char[] ch2 = str2.replaceAll("\\s+","").toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            return Arrays.equals(ch1, ch2);
        }
    }

}
