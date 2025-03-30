package School_excercise;

import java.util.Scanner;

public class Manager extends Person {
    private String department;

    public Manager() {
        super();
        this.department = department;
    }

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }
}
