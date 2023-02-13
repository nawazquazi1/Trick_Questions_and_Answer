import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

public class Questions_32 {
    public static void main(String[] args) {
        calculate_average_Of_array(new int[]{1,2,3,4,5,3,2,3,4});
        calculate_average_Of_array1(new int[]{1,2,3,4,5,3,2,3,4});
    }

    public static void calculate_average_Of_array1(int [] arr) {
        OptionalDouble avg= Arrays.stream(arr).average();
        System.out.println(avg.getAsDouble());
    }
    public static void calculate_average_Of_array(int [] arr){
        int total=0;
        for (int i:arr){
            total+=i;
        }
        System.out.println(total/arr.length);


    }
}
