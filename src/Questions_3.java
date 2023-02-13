import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

public class Questions_3 {
    public static void main(String[] args) {

        //. Arrays Fill Method
        Object[] num = new Object[100];
        Arrays.fill(num, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));

        // BitSet
        String set = new BitSet() {{
            set(1, 101);
        }}.toString();
        System.out.append(set, 1, set.length());
    }
}
