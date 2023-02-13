import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Questions_15 {
    public static void main(String[] args) {
//        Duplicat(new int[]{112, 345, 112, 32, 54, 112});
//        hasSet(new int[]{21, 32, 21, 2, 43, 21, 32});
        hasMap(new int[]{ 21, 32, 21, 2, 43, 21, 32});
    }

    public static void Duplicat(int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void hasSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int a : arr) {// 21,32,21,2,43,21,32
            if (!set.add(a)) {
                System.out.println(a);
            }
        }
        System.out.println(set);
    }

    public static void hasMap(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {// 21, 32, 21, 2, 43, 21, 32
            Integer count = hashMap.get(i);
            if (count == null) {
                hashMap.put(i, 1);//21-3,32-2,2-1,43-1,
            } else {
                hashMap.put(i, ++count);
            }
        }
          Set<Map.Entry<Integer,Integer>> entries=hashMap.entrySet();
            for (Map.Entry<Integer,Integer> entry:entries){
                if (entry.getValue()>1){
                    System.out.println(entry.getKey());
                }
            }
        }
}
