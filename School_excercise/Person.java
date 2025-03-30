package School_excercise;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person() {

    }

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public void input(Scanner sc) {
         name = sc.nextLine();
         age = sc.nextInt();
         sc.nextLine();
         salary = sc.nextDouble();
         sc.nextLine();
    }

}
