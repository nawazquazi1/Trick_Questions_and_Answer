import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.time.format.SignStyle;
import java.util.*;

public class Questions_18 {
    public static void main(String[] args) {
    }

    public static void duplicate_String(String  str){
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
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }

   public static void duplicate_String1(String  str) {
       char []ch=str.toCharArray();
       HashMap<Character,Integer>hashMap=new HashMap<>();
       for (char c:ch){
           if (hashMap.containsKey(c)){
               hashMap.put(c,hashMap.get(c)+1);
           }else {
               hashMap.put(c,1);
           }
       }
       Set<Map.Entry<Character ,Integer>> entries=hashMap.entrySet();
       for (Map.Entry<Character,Integer> entry:entries){
           if (entry.getValue()>1){
               System.out.println(entry.getKey()+"="+entry.getValue());
           }
       }
   }
}
