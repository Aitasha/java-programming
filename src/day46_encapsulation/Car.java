package day46_encapsulation;

public class Car {

    //PARAMETER VARIABLES
    private String model; //"private" is an access modifier
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;
    }

    //getter method for model
    public String getModel() {
        return model;
    }

    //setter for year
    public void setYear(int year){ //int carYear is an instance variable
        this.year = year;
    }

    //getter for year
    public int getYear() {
        return year;
    }

    //setter for mileage
    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    //getter for mileage
    public int getMileage(){
        return mileage;
    }

 //toString is supposed to be here


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
