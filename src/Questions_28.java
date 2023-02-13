import java.util.StringJoiner;

public class Questions_28 {
    /*
    What is stringJoiner ?
    int JDK 8
     */
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("'", "{", "}");
        stringJoiner.add("tom").add("lisa").add("naveen");
        System.out.println(stringJoiner);
    }


}
