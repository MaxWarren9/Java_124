package lab3;

/*
Создайте простой класс, который будет иметь поля: цвет, название, вес.
Создайте метод в классе через который можно будет вывести все эти данные.
Добавьте два объекта, установите для них значения и выведите все при
помощи ранее созданного метода.
Также добавьте несколько конструкторов, которые будут устанавливать:
●	только цвет машины;
●	цвет и вес машины;
●	и пустой конструктор.
 */
public class Car {
    private String color;
    private String name;
    private double weight;

    public Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    public Car(String color) {
        this.color = color;
    }
    public Car() {
    }
    public void Printer() {
        System.out.println(color);
        System.out.println(name);
        System.out.println(weight);
    }

    public static void main(String[] args) {
        Car car = new Car("red");
        Car bmw = new Car("blue", 92.0);
        bmw.Printer();
        car.Printer();
    }
}
