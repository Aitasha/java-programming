package day51_inheritance;

public class Employee {
    String jobTitle;
    int annualWorkingHours = 2087;


    public double calculateSalary(double hourlyRate){


        return hourlyRate * annualWorkingHours * 1.1;//1.1 is 10% bonus

    }

    //toString method is inherites from Object class by default
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
