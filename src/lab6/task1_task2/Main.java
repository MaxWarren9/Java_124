package lab6.task1_task2;

public class Main {
    public static void main(String[] args) {
        Human client = new Client("Maxim", "Voinov", "Rosbank");
        Human employee = new Employee("Max", "Warren", "Sberbank");
        System.out.println(client);
        System.out.println(((Client) client).money());
        System.out.println(employee);
        System.out.println(((Employee) employee).money());
    }
}
