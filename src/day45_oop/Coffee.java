package day45_oop;

public class Coffee {
    int amount;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill() {
        amount = 100; // class level access       if variable is outside the method and inside the class it can be used by all methods in the class
        System.out.println("amount = " + amount);
    }


    public void drink(int someAmount) {
            amount -= someAmount;
    }

    public int getAmount() {
        return amount;
    }

    public void setType(String newType) {
        type = newType;
    }

    public String getType() {
        return type;
    }

}
