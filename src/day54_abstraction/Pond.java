package day54_abstraction;

public class Pond {
    Water water;

    public Pond(String color){
        water = new Water(color);
    }

}

class Water{
    String color;

    public Water(String color){
        this.color = color;
    }
}
