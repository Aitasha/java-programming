package day50_inheritance;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class Student extends Person{
    int studentID;
    String school;

    public void study(String topic){
        System.out.println(name + " is studying " + topic);

    }



}
