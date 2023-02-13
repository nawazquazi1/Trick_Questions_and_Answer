import java.util.Arrays;

public class Questions_53 {

    public static <arr1> void main(String[] args) {
        int[][] arr1 = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        int[][] arr2 = {{-9, -8, -7}, {-6, -5, -4}, {-3, -2, }};
        int[][] sum = new int[arr1.length][arr1.length];
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        System.out.println("sum of two matrices ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum));
    }
}
