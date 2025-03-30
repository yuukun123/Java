package School_exercise_electronics;

import java.util.Scanner;

public class computer extends product {
    private String cpu;
    private int ram;
    private int stroage;

    public computer() {
        super();
    }

    public computer(int id, double price, String brand, String cpu, int ram, int stroage) {
        super(id, price, brand);
        this.cpu = cpu;
        this.ram = ram;
        this.stroage = stroage;
    }

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getStroage() {
        return stroage;
    }
    public void setStroage(int stroage) {
        this.stroage = stroage;
    }
    public void output() {
        System.out.println(toString());
    }
    public String toString() {
        return "computer{" + "id: " + getId() + ", price: " + getPrice() + ", brand: " + getBrand() + ", cpu: " + cpu + ", ram: " + ram + ", stroage: " + stroage + '}';
    }

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter cpu: ");
        cpu = sc.nextLine();
        System.out.print("Enter ram: ");
        ram = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter stroage: ");
        stroage = sc.nextInt();
        sc.nextLine();
    }
}
