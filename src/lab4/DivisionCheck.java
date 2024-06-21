package lab4;

/*
2.	Напишите программу, которая выводит числа от 1 до 100, которые делятся на
    3, 5 и на то и другое (то есть и на 3 и на 5). Пример вывода:

	Делится на 3: ….
	Делится на 5: ….
	Делится на 3 и на 5: ….
 */
public class DivisionCheck {
    public static void dividedBy3() {
        System.out.print("Делится на 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }

    public static void dividedBy5() {
        System.out.println();
        System.out.print("Делится на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }

    public static void dividedBy3And5() {
        System.out.println();
        System.out.print("Делится на 3 и на 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + " ");
                i++;
            }
        }
    }

    public static void main(String[] args) {
        dividedBy3();
        dividedBy5();
        dividedBy3And5();
    }
}
