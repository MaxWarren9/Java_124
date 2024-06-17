package lab1;
import java.util.Scanner;
public class EvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                if ((number > 100) && (number % 2 == 0)) {
                    System.out.println("Выход за пределы диапазона");
                    continue;
                }
                if (number % 2 == 0) {
                    System.out.println("Четное");
                } else
                    System.out.println("Нечетное");
            }
        }
    }
}

