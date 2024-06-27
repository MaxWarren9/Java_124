package lab6.task1_task2;

public class Employee extends Human implements Interface {
    String bankName;

    public Employee(String name, String surname) {
        super(name, surname);
    }

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "bankName='" + bankName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public String money() {
        String approach = "Управляет деньгами клиента";
        return approach;
    }
}
