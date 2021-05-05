package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Etsy Search Smoke test---");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("---Starting Etsy Search Smoke test---");


    }
    public static void openBrowser() {
        System.out.println("Launching Chrome browser");
    }

    public static void navigateToEtsyUrl() {
        System.out.println("Navigate to https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("Search for wooden spoon");
        System.out.println("Search for wooden spoon");
    }

    public static void verifyResultsAreDisplayed() {
        System.out.println("Verify results are displayed");
    }
}
