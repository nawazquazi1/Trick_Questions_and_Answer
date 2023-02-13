import java.util.Arrays;

public class Questions_36 {

    public static void main(String[] args) {
        shiftZeroRight(new int[]{1, 0, 2, 0, 3, 0, 0, 0});
    }

    public static void shiftZeroRight(int[] arr) {
        int[] a = new int[arr.length];
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                a[count] = i;
                count++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
