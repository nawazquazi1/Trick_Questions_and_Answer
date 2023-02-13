public class Questions_26 {
    public static void main(String[] args) {
        findMissingNumber(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10});
        findMissingNumber1(new int[]{1, 2, 3, 4, 5, 7, 8, 9, 10});
    }

    public static void findMissingNumber(int[] num) {
        int d = num.length + 1;
        int sum = d * (d + 1) / 2;
        int actualSum = 0;
        for (int i : num) {
            actualSum += i;
        }
        System.out.println(sum - actualSum);
    }

    public static void findMissingNumber1(int[] num) {
        int n=num.length;
        int x1=num[0];
        int x2=1;
        for (int i=1;i<n;i++){
            x1=x1^num[i];
        }
        for (int i=2;i<=n+1;i++){
            x2=x2^i;
        }
        System.out.println(x1^x2);
    }
}
