public class Questions_10 {
    public static void main(String[] args) {
/*
          how Many String Objects be created
 */
        String s1="Hello World";
        String s2="Hello World";
        String s3=s1;
        String n1=new String("Hello World");
        String n2=new String("Hello World");
        // 3 objects will create

        System.out.println(s1==s2);//true
        System.out.println(s2==s3);//true
        System.out.println(s1==s3);//true

        System.out.println(n1==n2);//false
        System.out.println(s1==n2);//false

    }
}
