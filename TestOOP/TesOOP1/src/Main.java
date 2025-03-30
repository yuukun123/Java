import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        employee.input(sc);
        employee.output();

        Manager manager = new Manager();
        manager.input();
        manager.output();

    }
}