package lab6.task5;
import java.util.Scanner;
public class Parent {
    Scanner scanner = new Scanner(System.in);
    protected int age;
    public void getInfo() {
        System.out.println("Enter age: ");
        int age = scanner.nextInt();
    }

}
