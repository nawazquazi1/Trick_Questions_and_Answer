import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questions_33 {
    public static void main(String[] args) {
       System.out.println( isCapitalized("thisNaveenAutomationLabsYoutubeTestingJava"));
       System.out.println( isCapitalized1("thisNaveenAutomationLabsYoutubeTestingJava"));
       System.out.println( isCapitalized2("thisNaveenAutomationLabsYoutubeTestingJava"));
       System.out.println( isCapitalized4("thisNaveenAutomationLabsYoutubeTestingJava"));
       System.out.println( isCapitalized45("thisNaveenAutomationLabsYoutubeTestingJava"));
       System.out.println( isCapitalized46("thisNaveenAutomationLabsYoutubeTestingJava"));
    }

    public static int isCapitalized( String  str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>='A'&&str.charAt(i)<='z'){
                count++;
            }
        }
        return count;
    }

    public static int isCapitalized1(String  str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)>=65&&str.charAt(i)<=90){
                count++;
            }
        }
        return count;
    }

    public static int isCapitalized2(String  str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (Character.isUpperCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }

    //streams
    public static long isCapitalized4(String  str){
        return str.chars().filter(value -> value>=65&&value<=90 ).count();
    }

    public static long isCapitalized45(String  str){
        return str.chars().filter(Character::isUpperCase).count();
    }

    public static long isCapitalized46(String  str){
        Pattern pattern=Pattern.compile("[A-Z]+");
        Matcher matcher=pattern.matcher(str);
        int count=0;
        while (matcher.find()){
            count++;
        }
        return count;
    }



}
