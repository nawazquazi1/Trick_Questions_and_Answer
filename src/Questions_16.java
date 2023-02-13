public class Questions_16 {
    public static void main(String[] args) {
        pattern_1(5);
        System.out.println("------------------");
        pattern_2(5);
        System.out.println("--------------------");
        pattern_3(5);
        System.out.println("-------------------");
    }

    public static void pattern_1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern_2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern_3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
