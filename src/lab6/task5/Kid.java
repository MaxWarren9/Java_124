package lab6.task5;

public class Kid extends Parent{
    protected String name;
    @Override
    public void getInfo() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
    }
}
