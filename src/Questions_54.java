import java.util.Arrays;
import java.util.Scanner;

public class Questions_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row 1");
        int r1 = sc.nextInt();
        System.out.println("clom 1");
        int c1 = sc.nextInt();
        int[][] one = new int[r1][c1];
        System.out.println("input data");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                one[i][j] = sc.nextInt();
            }
        }
        System.out.println("row 2");
        int r2 = sc.nextInt();
        System.out.println("clom 2");
        int c2 = sc.nextInt();
        int[][] two = new int[r2][c2];
        System.out.println("input data");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                two[i][j] = sc.nextInt();
            }
        }

        if (c1 == c2) {
            System.out.println("invalid input ");
            return;
        }

        int[][] product = new int[r1][c2];
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < product[0].length; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += one[i][k] * two[k][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(product));


    }
}
