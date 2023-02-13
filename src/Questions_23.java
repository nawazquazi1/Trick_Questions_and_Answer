import java.lang.reflect.Field;
// nhi huwa h
public class Questions_23 {
    // Create a string language Translator
    static {
        try {
            Field value=String.class.getDeclaredField("value");
            value.setAccessible(true);
            value.set("Hello nawaz",value.get("Hola nawaz"));
            value.set("good morning nawaz",value.get("Buenos dias nawaz"));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello nawaz");
        System.out.println("good morning nawaz");
    }



}
