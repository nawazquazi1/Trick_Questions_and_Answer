public class Questions_40 {
    public static void main(String[] args) {
        isRevers(1234);
        System.out.println();
        isRevers1(1234);
    }
    public static void isRevers(int n) {
        while (n>0){
            int i=n%10;
            System.out.print(i);
            n/=10;
        }
    }


    public static void isRevers1(int n) {
        if (n<10){
            System.out.println(n);
            return;
        }else {
            System.out.print(n%10);
            isRevers1(n/10);
        }
    }
}
