public class Questions_6 {
    public static void main(String[] args) {
        /*
         * what is Nan - Not a number
         * How is NaN Defined in Different Languags ?
         * java ,c,c++,Ruby,Python,JavaScript
         */
        System.out.println(2.0 / 0.0);//in
        System.out.println(0.0 / 0.0);//nan
        System.out.println(Math.sqrt(-1));//nan
        System.out.println(Float.NaN == Float.NaN);
        System.out.println(Float.NaN != Float.NaN);
        double nan=2.1%0;//nan
        System.out.println(2.1%0==nan);
        System.out.println(nan==nan);
    }
}
