//1
public class Questions_12 {
    /*
     *Q1 Explain Static blocks in java
     */
    static {
        System.out.println("static block1");
    }

}

//2
class Questions_12_part2 {
    /*
     *2 how can we ran a java program without making any object
     */
    public static void test() {
        System.out.println("test method");
    }

    static {
        System.out.println("static block2");
    }
}

//3
class Questions_12_part3 {
    /*
     *3 Similarity and Difference between static block and Static method
     */
    public static void test() {
        System.out.println("test method");
    }

    public static void Cover() {
        System.out.println("Cover method");
        test();
    }
}

//4
class Questions_12_part4 {
    /*
     *4 How can we create objects if we make the constructor private
     */
    int age;

    private Questions_12_part4() {
        age = 18;
    }

    private static final Questions_12_part4 questions_12 = new Questions_12_part4();

    public static Questions_12_part4 getInstance() {
        return questions_12;
    }
}

//4
class constructor_private {
    public static void main(String[] args) {
        Questions_12_part4 questions_12 = Questions_12_part4.getInstance();
        System.out.println(questions_12.age);
        System.out.println(questions_12);
        Questions_12_part4 questions_121 = Questions_12_part4.getInstance();
        System.out.println(questions_121.age);
        System.out.println(questions_121);

    }
}

//5
class Questions_12_part5 {
    /*
     *5 Is it Possible to compile and run a java program without writing main method
     */
    static {
        System.out.println("Hello world");
    }
}

//6
class Questions_12_part6 {
    /*
     *6 can we initialize member variables within static block
     */
    String name;
    static int age;

    static {
        Questions_12_part6 static_block = new Questions_12_part6();
        static_block.name = "nawaz";
        age = 20;
    }
}

//7
class Questions_12_part7 {
    /*
    Will the static  block be executed in the following code ? way ?
     */
    static {
        System.out.println("Questions_12_part7 ------------ Static Block");
    }

    public static final int x = 20;//20
    public final int y = 20;

    public static void main(String[] args) {
        System.out.println(Questions_12_part7.x);//20
        System.out.println(new Questions_12_part7().y);
        // Questions_12_part7 ------------ Static Block
        // 20
    }
}

//8
class Questions_12_part8 {
    /*
    what will be the output of executing following class
     */
    static {
        System.out.println("Static block ");
    }
    {
        System.out.println("Initialization Block");
    }
    Questions_12_part8() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Questions_12_part8 questions_12_part8=new Questions_12_part8();
        System.out.println("Main Method");
    }
}


