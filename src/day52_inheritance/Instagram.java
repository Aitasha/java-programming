package day52_inheritance;

public class Instagram extends MobileApp {

    public void postPhoto(){

        System.out.println("Posting photo on IG");

    }

    @Override
    public void useTheApp(int minutes){ // rule #1 - Same name, same parameters (same signature);
                                        // rule #2 - Access modifier must be the same or more visible:
                                                     // public>public;
                                                     // protected>protected/public;
                                                     // default>default/protected/public;
                                                     // private > is not inherited, so it is not overriding:
                                                     // ERROR: private variable or method is not inherited | Method must be inherited to be able to overriding
                                        // rule #3 - Return type must be same or sometimes sub class version if there is a sub class:
                                                     // Covariant return type(sub


        super.useTheApp(minutes);
        System.out.println("Using IG app features");
        postPhoto();

    }


}
