package lab4;

/*
1.	Напишите программу, которая выводит на консоль
нечетные числа от 1 до 99. Каждое число печатается с новой строки.
 */
public class OddPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }
}
