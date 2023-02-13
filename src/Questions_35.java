import java.util.ArrayList;

public class Questions_35 {

    public static void main(String[] args) {
        student student1 = new student("aakib", 111, 90, 15);
        student student2 = new student("nawaz", 112, 60, 17);
        student student3 = new student("alfez", 113, 87, 14);
        student student4 = new student("taj", 114, 98, 18);
        student student5 = new student("raqib", 115, 100, 16);


        ArrayList<student> arrayList = new ArrayList<>();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);

        // name where marks >80
//        arrayList.stream().filter(value -> value.getMarks() > 80)
//                .forEach(e -> System.out.println(e.getName() + ":" + e.getMarks()));

        int hm=arrayList.stream().map(e->e.getMarks()).max(Integer::compare).get();
        System.out.println("Highest marks: "+hm);
        arrayList.stream().filter(e->e.getMarks()==hm).forEach(System.out::println);

    }


}

class student {
    private String name;
    private int marks;
    private int rollNo;
    private int age;

    public student(String name, int rollNo, int marks, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                ", age=" + age +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}