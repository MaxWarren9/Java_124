package lab1;

import java.util.Scanner;

public class Integer {
    public void Scan() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                System.out.println(number);
            } else
                scanner.next();
        }
    }

    public static void main(String[] args) {
        Integer integer = new Integer();
        integer.Scan();
    }
}
