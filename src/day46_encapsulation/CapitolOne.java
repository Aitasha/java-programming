package day46_encapsulation;

public class CapitolOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(4643321335454L);
        acc.setBalance(250.85);
        acc.setAccountHolder("Mike Smith");
        acc.setType("360 Checking");

        System.out.println("acc = " + acc);


        acc.setAccountInfo(4643321335454L, "Mike Smith", 250.85,"360 Checking");
        System.out.println("acc = " + acc);
    }
}
