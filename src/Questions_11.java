public class Questions_11 {
    public static void main(String[] args) {
        /*
        pass null argument with method overloading with string and object type
         */
        test(null);
    }

    public static void test(Object o) {
        System.out.println("Object Argument");
    }

    public static void test(String o) {
        System.out.println("String Argument");
    }

}
