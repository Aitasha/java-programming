package day17_ternary_nested_conditions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate > 45) ? "accept" : "reject";
        System.out.println(reply);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println(teacher);

    boolean isEligibleToDrive = false;
    String driving = (isEligibleToDrive) ? "have DL, can drive" : "no DL, cannot drive";
        System.out.println(driving);


    }

}