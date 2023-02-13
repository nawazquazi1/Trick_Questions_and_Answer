import java.util.function.IntPredicate;

public class Questions_30 {
    public static void main(String[] args) {
//        String  str="testing";
//        int count=0;
//        String str2="";
//        for (int i=0;i<str.length();i++){
//            if (isVowel(str.charAt(i))){
//                System.out.println(str.charAt(i));
//                count++;
//            }
//        }
//        System.out.println(count);

        // java 8 Streams
        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int ch) {
                return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            }
        };
        String  test="aeiou";
        long count=test.chars().filter(vowel).count();
        System.out.println(count);
    }

    public static boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'
        || ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }




}
