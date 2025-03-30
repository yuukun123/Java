import java.util.Scanner;

public class Manager {
    private int id;
    private String name;
    private double salary;

    Scanner sc = new Scanner(System.in);

    public Manager() {

    }

    public Manager(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void input(){
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }

    public void output(){
        System.out.printf("| Id: %02d | Name: %-4s | Salary: %04.1f |\n", id, name, salary);
    }

}
