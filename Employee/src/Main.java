import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employee = null;

        Manager[] manager = null;

        int option;
        do {
            System.out.println();
            System.out.println("=========MENU=========");
            System.out.println("1. Employee");
            System.out.println("2. List Employee");
            System.out.println("3. Sort Employee with id");
            System.out.println("4. Manager");
            System.out.println("5. List Manager");
            System.out.println("6. Sort Manager with id");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();
            switch (option) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println();
                    System.out.print("Enter number of employees: ");
                    int n = sc.nextInt();
                    employee = new Employee[n];
                    for (int i = 0; i < n; i++) {
                        employee[i] = new Employee();
                        System.out.println();
                        System.out.println("Employee " + (i + 1));
                        employee[i].input();
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("List Employee: ");
                    System.out.print("--------------------------------------\n");
                    for (Employee value : employee) {
                        value.output();
                    }
                    System.out.print("--------------------------------------\n");
                    break;
                case 3:
                    System.out.println();
                    for (int i = 0; i < employee.length; i++) {
                        Arrays.sort(employee, Comparator.comparingInt(Employee::getId));
                    }
                    System.out.println("List Employee after sort: ");
                    System.out.print("--------------------------------------\n");
                    for (Employee value : employee) {
                        value.output();
                    }
                    System.out.print("--------------------------------------\n");
                    break;
                case 4:
                    System.out.println();
                    System.out.print("Enter number of managers: ");
                    int m = sc.nextInt();
                    manager = new Manager[m];
                    for (int i = 0; i < m; i++) {
                        manager[i] = new Manager();
                        System.out.println();
                        System.out.println("Manager " + (i + 1));
                        manager[i].input();
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("List Manager: ");
                    System.out.print("--------------------------------------\n");
                    for (Manager value : manager) {
                        value.output();
                    }
                    System.out.print("--------------------------------------\n");
                    break;
                case 6:
                    System.out.println();
                    for (int i = 0; i < manager.length; i++) {
                        Arrays.sort(manager, Comparator.comparingInt(Manager::getId));
                    }
                    System.out.println("List Manager after sort: ");
                    System.out.print("--------------------------------------\n");
                    for (Manager value : manager) {
                        value.output();
                    }
                    System.out.print("--------------------------------------\n");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (true);

    }
}