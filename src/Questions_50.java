public class Questions_50 {
    public static void main(String[] args) {
//        System.out.println(isArmstrongNumber(0));
//        System.out.println(isArmstrongNumber(1));
//        System.out.println(isArmstrongNumber(9));
//        System.out.println(isArmstrongNumber(-1));


        System.out.println(isArmstrongNumber(153));

    }

    public static boolean isArmstrongNumber(int num) {
        if (num < 0) {
            return false;
        }

        if (num >= 0 && num <= 9) {
            return true;
        }
        int  copyNumber= num;
        int power=power(num);
        int sum = 0;
        while (copyNumber != 0) {
            int last = copyNumber % 10;
            int factor = 1;
            for (int i = 0; i < power; i++) {
                factor = factor * last;
            }
            sum += factor;
            copyNumber = copyNumber / 10;
        }
        if (sum == num) {
            return true;
        }
        return false;
    }

    public static int power(int num){
        int digit = 0;
        while (num != 0) {
            digit++;
            num /= 10;
        }
        return digit;
    }

}
