package lab6.task3;

public class Truck extends Car {
    protected int amountOfWheels;
    protected double maximumWeight;
    public void newWheels(int newWheels) {
        this.amountOfWheels = newWheels;
        System.out.println(amountOfWheels);
    }
    public Truck(int w, String m, char c, float s, int amountOfWheels, double maximumWeight) {
        super(w, m, c, s);
        this.amountOfWheels = amountOfWheels;
        this.maximumWeight = maximumWeight;
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес: " + amountOfWheels + ", максимальный вес: " + maximumWeight);
    }
}
