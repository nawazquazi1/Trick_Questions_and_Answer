public class Questions_20 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int num){
        char c='A';
        for (int i=0;i<=num;i++){
            for (int j=0;j<=i;j++){
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }
}
