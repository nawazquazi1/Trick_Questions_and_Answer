import java.util.Arrays;
import java.util.stream.Stream;

public class Questions_31 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(join_2_array(new String[]{"a", "b", "c", "d"}, new String[]{"e", "f", "g", "h"})));
        merge_Array(new String[]{"a", "b", "c", "d"}, new String[]{"e", "f", "g", "h"});
        stream(new String[]{"a", "b", "c", "d"}, new String[]{"e", "f", "g", "h"});
    }

    public static void merge_Array(String[] basement, String[] bowlers ){
        String [] str=new String[basement.length+bowlers.length];
        System.arraycopy(basement,0,str,0,basement.length);
        System.arraycopy(bowlers,0,str,basement.length,bowlers.length);
        System.out.println(Arrays.toString(str));

    }

    public static void stream(String[] basement, String[] bowlers){
        Stream<String> bat=Arrays.stream(basement);
        Stream<String> bol=Arrays.stream(bowlers);
        String []fullTeam=Stream.concat(bat,bol).toArray(size->new String[size]);
        System.out.println(Arrays.toString(fullTeam));
    }

    public static String[] join_2_array(String[] basement, String[] bowlers) {
       String [] str=new String[basement.length+bowlers.length];
       int pos=0;
       for (String ba:basement) {
           str[pos] = ba;
           pos++;
       }
       for (String  bo:bowlers){
           str[pos]=bo;
           pos++;
       }
       return str;
        }
    }

