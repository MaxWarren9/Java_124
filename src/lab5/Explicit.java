package lab5;
import java.util.Scanner;
public class Explicit {
    public static void changer(String text) {
        String str = text.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        changer(text);
    }
}
