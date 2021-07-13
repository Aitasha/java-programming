package day58_polymorphism;

public class Casting {

    public static void main(String[] args) {
        //variable of worker and object of superMan

        Worker worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();

        //down casting from Worker to SuperMan
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
        superMan.work("JAVA");



    }

}
