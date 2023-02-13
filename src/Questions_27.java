import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questions_27 {

    /*
         Find Length Without Length() Method
     */
    public static void main(String[] args) {
        String str = "testing";
        System.out.println(str.lastIndexOf(""));
        System.out.println(str.toCharArray().length);
        System.out.println(str.split("").length);
        Find_Length_Without_Length(str);
        System.out.println(Find_Length_Without_Length1(str));
        Find_Length_Without_Length2(str);
        Find_Length_Without_Length3(str);
    }

    public static void Find_Length_Without_Length(String str) {
        Pattern pattern = Pattern.compile("$");
        Matcher matcher = pattern.matcher(str);
        matcher.find();
        int i = matcher.end();
        System.out.println(i);
    }


    public static int Find_Length_Without_Length1(String str) {
        int i = 0;
        try {
            while (true) {
                str.charAt(i);
                i++;
            }
        } catch (IndexOutOfBoundsException e) {
            return i;
        }
    }

    public static void Find_Length_Without_Length2(String str){
        int l1=0;
        try {
            l1=str.getBytes("UTF-16BE").length/2;
        }catch (Exception e){
        }
        System.out.println(l1);
    }
   public static void Find_Length_Without_Length3(String str){
       String[]strings=str.split("");
       int count=0;
       for (String s:strings){
           count+=s.toCharArray().length;
       }
       System.out.println(count);
    }

}
