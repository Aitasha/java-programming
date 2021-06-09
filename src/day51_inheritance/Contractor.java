package day51_inheritance;

public class Contractor extends Employee {

    @Override /* added for 1) Lets know you overriding; 2) ensures that this method has been overridden */
    public double calculateSalary(double hourlyRate){

        //we customize method for this subclass by removing bonus from the code
        return 50 * 40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
