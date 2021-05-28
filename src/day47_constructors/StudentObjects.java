package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Ayta");
        Student st4 = new Student("Roman");

        Student st5 = new Student("35");
        Student st6 = new Student("Ayta", 35);
    }
}
