package lab5;
import java.util.Scanner;
public class Substring {
    public static void enter(String inicialText, String substring) {
        int count = 0;
        String spl[] =  inicialText.split(" ");
        for (int i = 0; i < spl.length; i++) {
            if (spl[i].equalsIgnoreCase(substring)) {
                count++;
            }
            }
        System.out.println(count);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inicialText = scanner.nextLine();
        System.out.println("Введите подстроку: ");
        String substring = scanner.nextLine();
        enter(inicialText, substring);
    }
}
