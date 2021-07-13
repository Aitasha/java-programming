package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape shape = new Triangle();
        shape.draw();

        shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Square());

        for (Shape eachShape: shapes) {
            eachShape.draw();
        }

        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());

    }

    public static void drawShape(Shape shape){
        System.out.println("Drawing shape");
        shape.draw();
    }





}
