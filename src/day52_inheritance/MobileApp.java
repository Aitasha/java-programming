package day52_inheritance;

public class MobileApp {
    private String name;
    private Double version;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    protected boolean download(){

        System.out.println("App: " + name + " version " + " is downloaded");
        return true;

    }

    public void useTheApp(int minutes){

        System.out.println("Using " + name + " app for " + minutes + " minutes");

    }



}
