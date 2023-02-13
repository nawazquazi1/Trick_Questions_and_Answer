import com.sun.tools.javac.Main;

import java.util.regex.Matcher;

public class Questions_34 {
    public static void main(String[] args) {
        System.out.println(isSubstring("naveen automation labs","labs"));

    }

    public static boolean isSubstring(String s1,String s2){

        return s1.matches("(.*)"+s2+"(.*)");
    }

    public static boolean isSubstring1(String s1,String s2){
        return s1.contains(s2);
    }
    public static boolean isSubstring2(String s1,String s2){
        return s1.indexOf(s2)!=-1;
    }
}
