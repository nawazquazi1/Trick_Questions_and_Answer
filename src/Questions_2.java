import java.util.stream.IntStream;

public class Questions_2 {

    public static void main(String[] args) {
        /*
        Print 1 to 10 without using any loop
        1. recursive Function
         */
        PrintNumber(1);
        IntStream.range(1,101).forEach(System.out::println);
    }

    public static void PrintNumber(int num){
        if(num<='d'){
            System.out.println(num);
            num++;
            PrintNumber(num);
        }
    }
}
