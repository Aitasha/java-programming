package day54_abstraction;

public abstract class MenuItem {
    public abstract void prepare();
    public abstract void serve();
}


class Pizza extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Put cheese and bake it");
    }

    @Override
    public void serve() {
        System.out.println("Serve it on a board");
    }
}

class Salad extends MenuItem{
    @Override
    public void prepare() {
        System.out.println("Chop veggies, add dressing");
    }

    @Override
    public void serve() {
        System.out.println("Put into a bowl and serve with forks");
    }
}
