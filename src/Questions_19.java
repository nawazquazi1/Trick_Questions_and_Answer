import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Questions_19 {
    public static void main(String[] args) {
        count_occurrences("i love coding");
        count_occurrences1("i love coding",'i');
    }
    public static void count_occurrences(String  str){
        char [] str2 = str.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char cha : str2) {
            Integer count = hashMap.get(cha);
            if (count == null) {
                hashMap.put(cha, 1);
            } else {
                hashMap.put(cha, ++count);
            }
        }
        Set<Map.Entry<Character ,Integer>> entries=hashMap.entrySet();
        for (Map.Entry<Character,Integer> entry:entries){
                System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
    public static void count_occurrences1(String str,char val){
        int count=0;
        for (char c:str.toCharArray()){
            if (c==val){
                count++;
            }
        }
        System.out.println(count);
    }
}
