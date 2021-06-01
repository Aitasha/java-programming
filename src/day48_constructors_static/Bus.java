package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    Driver driver;
    Engine engine;

    public String toString(){
        return driver.getName() + " | " + engine.getCylinders();
    }

}
