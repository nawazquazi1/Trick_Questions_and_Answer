public class Questions_4 {
    public static void main(String[] args) {
        // print hello world  without using semi ccolon(;)
        //1
        if (System.out.printf("Hello world" + "\n") == null) ;
        //2
        if (System.out.append("Hello world" + "\n") == null) ;
        //3
        if (System.out.append("Hello world " + "\n").equals(null)) ;
        //4
        for (int i = 0; i < 1; System.out.println("Hello World ")) {
            i++;
        }
    }
}
