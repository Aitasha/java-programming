package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();//after this code runs it won't run second time    static > constructor
        StaticBlockDemo st2 = new StaticBlockDemo();//won't run as it has been already loaded    constructor only
        StaticBlockDemo st3 = new StaticBlockDemo();// constructor only

        System.out.println(StaticBlockDemo.num); //25

        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num);

    }
}
