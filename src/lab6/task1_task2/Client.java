package lab6.task1_task2;

public class Client extends Human implements Interface {
    String bankName;

    public Client(String name,String surname) {
        super(name, surname);
    }

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "bankName='" + bankName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public String money() {
        String approach = "Приносит деньги банку";
        return approach;
    }
}
