package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1200.44;
        System.out.println("balance = " + balance);
        
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("Balance after baklava: " + balance);
        
        double kenafe = 44.45;
        System.out.println("kenafa = " + kenafe);
        balance = balance - kenafe;
        System.out.println("Balance after kenafe = " + balance);
        
        kenafe = kenafe / 2;
        System.out.println("kenafe = " + kenafe);

        balance = balance - kenafe;
        System.out.println("Balance after 2nd kenafe: " + balance);
        
        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("Balance after plov: " + balance);
        
        double icedTea = 3.0;
        System.out.println("iceTea = " + icedTea);
        icedTea = icedTea * 4;
        System.out.println("iceTea = " + icedTea);
        balance = balance - icedTea;
        System.out.println("Balance after 4 iced teas: " + balance );

        System.out.println("returning baklava: " + baklava);
        balance = balance + baklava;
        System.out.println("balance after returning baklava: " + balance);

    }
}
