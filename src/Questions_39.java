import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Questions_39 {
    public static void main(String[] args) {
        hasMap("test  test ");
    }

    public static void hasMap(String str) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        char[]chars=str.toCharArray();
//        for (char word:chars){
//            Integer c=hashMap.get(word);
//            if (c==null){
//                hashMap.put(word,1);
//            }else {
//                hashMap.put(word,++c);
//            }
//        }

        for (char word:chars) {
            if (!String.valueOf(word).isBlank()) {
                if (hashMap.containsKey(word)) {
                    hashMap.put(word, hashMap.get(word) + 1);
                } else {
                    hashMap.put(word, 1);
                }
            }
        }

        Set<Map.Entry<Character,Integer>>entries=hashMap.entrySet();
        for (Map.Entry<Character,Integer> entry:entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
