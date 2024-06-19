package lab1;

import java.util.Scanner;

public class EvenCheck {
    public void Scan() {
        Scanner scanner = new Scanner(System.in);
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

    public static void main(String[] args) {
        EvenCheck evenCheck = new EvenCheck();
        evenCheck.Scan();
    }
}

