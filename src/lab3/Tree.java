package lab3;
/*
Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева.
Создайте три конструктора:
●	Конструктор, который устанавливает только возраст и название;
●	Конструктор, который устанавливает все переменные в классе;
●	Конструктор, который ничего не устанавливает, но выводит
сообщение «Пустой конструктор без параметров сработал».
Создайте три объекта на основе класса и используйте по одному конструктору на каждый.
 */

public class Tree {
    private int age;
    private boolean isLive;
    private String name;

    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println(age + ", " + isLive + ", " + name);
    }

    public Tree(int age, boolean isLive, String name) {
        this.age = age;
        this.isLive = isLive;
        this.name = name;
        System.out.println(age + ", " + isLive + ", " + name);
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(2, "Nick");
        Tree tree3 = new Tree(3, true, "Max");
    }
}
