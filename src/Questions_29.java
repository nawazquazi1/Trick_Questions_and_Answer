import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Questions_29 {
    public static void main(String[] args) {
        hasMap("Testing solutions via naveen automaTion labs", 'T');
        System.out.println(getCharCount("Testing solutions via naveen automaTion labs", 'T'));
    }


    public static Long getCharCount(String str, char c) {
        return str.chars().filter(value -> (char) value == c).count();
    }

    public static void hasMap(String str, char ch) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] c = str.toCharArray();
        for (char i : c) {// 21, 32, 21, 2, 43, 21, 32
            Integer count = hashMap.get(i);
            if (count == null) {
                hashMap.put(i, 1);//21-3,32-2,2-1,43-1,
            } else {
                hashMap.put(i, ++count);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getKey() == ch) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}
