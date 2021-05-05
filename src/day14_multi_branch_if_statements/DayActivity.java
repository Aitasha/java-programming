package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";
        if (weather.equals("sunny")){
            System.out.println("Go to park, hike and code java");
        } else if(weather.equals("rainy")){
            System.out.println("stay home, drink tea and code java");
        } else if (weather.equals("snowy")){
            System.out.println("claen the car then build a snowman, drink hot chocolate and code java");
        } else if (weather.equals("windy")){
            System.out.println("get ready for power loss, fly a kite and code java");
        } else {
            System.out.println("just keep coding java");
        }

    }
}
