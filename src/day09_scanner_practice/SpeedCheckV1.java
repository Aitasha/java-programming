package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {

        int speedLimit = 55;
        int currentSpeedLimit = 75;
        int overTheLimit = currentSpeedLimit - speedLimit;

        System.out.println("You're driving " + overTheLimit + "mph over the limit. Slow down!");
    }
}
