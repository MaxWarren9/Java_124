package lab2;

/*
Создать класс, который обозначает какую-либо сущность.
Определить у него несколько конструкторов - конструктор
без параметров и конструктор со всеми параметрами.
Определить для него несколько параметров.
 */
public class Phone {
    private String brand;
    private String model;
    private String country;
    private int year;
    private int memory;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Phone(String brand, String model, String country, int year, int memory) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.memory = memory;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    @Override
    public String toString(){
        return "Brand: " + brand + " Model: " + model + " Country: " +
                country + " Year: " + year + " Memory: " + memory;
    }
    public static void main(String[] args) {
        Phone iphone = new Phone("Apple", "13", "China", 2019, 256);
        Phone phone2 = new Phone("Samsung", "S24");
        System.out.println(iphone.toString());
        System.out.println(phone2.toString());
    }
}
