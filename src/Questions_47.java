import java.util.HashMap;

public class Questions_47 {
    public static void main(String[] args) {
        getDigitCount(543507605);
    }

    public static void getDigitCount(int num) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        while (num != 0) {
            int lastDigit = num % 10;
            if (hashMap.containsKey(lastDigit)) {
                hashMap.put(lastDigit, hashMap.get(lastDigit) + 1);
            } else {
                hashMap.put(lastDigit, 1);
            }
            num/=10;
        }
        System.out.println(hashMap);
    }
}
