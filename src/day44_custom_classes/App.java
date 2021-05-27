package day44_custom_classes;

/**
 * App class is used as a template for App objects
 * We are describing app properties and behaviour here
 * Objects will be able to use them
 *
 * most of the time our methods are used to process this data
 */
public class App {
    String appName; //null by default
    double version; //0.0 by default

    //
    public void open() {
        System.out.println("opening " + appName + " app - version = " + version);
    }

}
