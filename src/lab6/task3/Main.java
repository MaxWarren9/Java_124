package lab6.task3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(38000, "Volvo", 'b', 120, 4, 60000);
        truck.outPut();
        System.out.println("Новое количество колес: ");
        truck.newWheels(10);
    }
}
