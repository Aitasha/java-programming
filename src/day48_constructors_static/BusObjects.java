package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class BusObjects {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        bus.engine = new Engine(10);

        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Aziz");
        metroBus.engine = new Engine(15);

        System.out.println(metroBus);

        //print Driver name
        System.out.println(metroBus.driver.getName());

    }
}
