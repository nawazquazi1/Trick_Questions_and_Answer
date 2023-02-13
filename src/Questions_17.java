public class Questions_17 {
    public static void main(String[] args) {
        pattern_1(5);
        pattern5(5);
        pattern(5);
    }

    public static void pattern5(int n) {
        int sp=n-1;
        int st=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
        sp--;
        st++;
            System.out.println();
        }
    }
    public static void pattern(int num){
        int c=65;
        for (int i=0;i<=num;i++){
            for (int j=0;j<=i;j++){
                System.out.print((char) (c+j)+" ");
            }
            System.out.println();
        }
    }




    public static void pattern_1(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n -i; j++) {
                System.out.print("\t");
            }
            for (int j= 1; j<= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
