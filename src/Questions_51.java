public class Questions_51 {
    public static void main(String[] args) {
        System.out.println( stringToNumber("75247655"));
        System.out.println( stringToNumber("75247655")+1);
    }

    public static int stringToNumber(String str) {
        int num = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            num = num * 10 + (int) str.charAt(i)-48;
        }
        return num;
    }
}
