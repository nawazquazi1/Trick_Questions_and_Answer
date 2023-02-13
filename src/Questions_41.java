import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Questions_41 {
    public static void main(String[] args) {
        System.out.println(isNumber("234fddg"));
        System.out.println(isValidPhoneNumber("9460985441"));
    }

    public static boolean isNumber(String str) {
        try {
            Long.parseLong(str);
            System.out.println("this is a valid number " + str);
        } catch (NumberFormatException n) {
            System.out.println("not a valid number " + n);
            return false;
        }
        return true;
    }


    public static boolean isValidPhoneNumber(String str) {
        if (str.length() == 10 && isNumber(str)) {
            System.out.println("number is valid");
            return true;
        } else {
            System.out.println("not a valid number");
        }
        return false;
    }

    public static void isValidPhoneNumber1(String str) {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(str);
        boolean flag = matcher.find();
        if (flag) {
            System.out.println("valid phone number");
        } else {
            System.out.println("not a valid number");
        }
    }

    public static boolean isValidPhoneCCNumber(String str) {
        if (str.length() == 16 && isNumber(str)) {
            System.out.println("valid CC number");
            return true;
        } else {
            System.out.println("not a valid number");
            return false;
        }
    }

}
