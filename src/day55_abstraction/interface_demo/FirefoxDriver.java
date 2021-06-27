package day55_abstraction.interface_demo;

public class FirefoxDriver implements WebDriver{
    @Override
    public void get(String url) {
        System.out.println("Firefox - navigating to " + url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("Firefox - locating element by " + locator);

    }

    @Override
    public void quit() {
        System.out.println("Firefox - quitting the driver");

    }

    @Override
    public String getTitle() {
        return "wooden spoon";
    }
}
