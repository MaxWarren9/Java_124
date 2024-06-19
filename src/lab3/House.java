package lab3;
import java.time.Year;
/*
Создайте класс Дом. Добавьте в него следующие данные:
●	поля: количество этажей, год постройки, наименование;
●	метод для установки всех значений;
●	метод для вывода всех значений;
●	метод, возвращающий количество лет с момента постройки.
На основе класса создайте два объекта и пропишите для каждого характеристики.
Добавление характеристик реализуйте через метод класса.
Выведите информацию про каждый объект.
 */
public class House {
    private int floors;
    private int year;
    private String names;
    public void setParameters(int floors, int year, String names) {
        this.floors = floors;
        this.year = year;
        this.names = names;
    }
    public void printParameters () {
        System.out.println("Количество этажей: " + floors);
        System.out.println("Год постройки: " + year);
        System.out.println("Наименование: " + names);
    }
    public void houseAge() {
        int i = Year.now().getValue();
        System.out.println(i - year);
    }

    public static void main(String[] args) {
        House house1 = new House();
        house1.setParameters(22,1999,"Притяжение");
        house1.printParameters();
        House house2 = new House();
        house2.setParameters(98,1933,"Черная речка");
        house2.printParameters();
        house2.houseAge();
    }

}
