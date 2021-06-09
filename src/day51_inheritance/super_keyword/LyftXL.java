package day51_inheritance.super_keyword;

public class LyftXL extends Lyft{

    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) * 1.1; //calling for parent class's method instead of repeating 4.5 * miles
    }

}
