package day44_custom_classes;

public class MyApps {
    public static void main(String[] args) {

        //String app = "uber"; this is String object, just characters
        App uberApp = new App();
        uberApp.open(); //call open method using object variable

        uberApp.appName = "Uber";
        uberApp.version = 2.5;
        uberApp.open();

        uberApp.version = 4.5;
        uberApp.open();// open new version

        /**
         * create more objects and practice
         * 
         */



    }
}
