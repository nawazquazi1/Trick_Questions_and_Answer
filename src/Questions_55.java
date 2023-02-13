public class Questions_55 {

    public static void main(String[] args) {
        find_Leaders(new int[]{92,7,12,9,8,3});
        find_Leaders(new int[]{92,11,10,9,8,14});
    }

    public static void find_Leaders(int[] arr) {
        int max = arr[arr.length - 1];
        System.out.println(max);
        for (int i =arr.length-2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
//                System.out.println(max);
            }
        }


    }
}
