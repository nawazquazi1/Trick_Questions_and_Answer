
public class Questions_42 {
    public static void main(String[] args) {
        isBinary(1111);
    }
    /*
    Check the given number is binary or not
     */

    public static void isBinary(int num) {
        boolean flag = true;
        int copyNumber = num;
        while (copyNumber != 0) {
            int rem = copyNumber % 10;
            if (rem > 1) {
                flag = false;
                break;
            } else {
                copyNumber /= 10;
            }
        }
        if (flag) {
            System.out.println(flag + " is a binary number");
        } else {
            System.out.println(flag + " is not a binary number");
        }
    }


    public static void isBinary1(int num) {
        if (String.valueOf(num).matches("[0-1]+")) {
            System.out.println(num + " is a binary number");
        } else {
            System.out.println(num + " is not a binary number");
        }
    }

    public static void isBinary2(int num) {
        try {
            Integer.parseInt(String.valueOf(num),2);
            System.out.println(num + " is a binary number");
        } catch (NumberFormatException e) {
            System.out.println(num + " is not a binary number");
        }
    }
}
