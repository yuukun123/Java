package School_exercise_electronics;

import java.util.Scanner;

public class product {
    private int id;
    private double price;
    private String brand;

    public product() {

    }

    public product(int id, double price, String brand) {
        this.id = id;
        this.price = price;
        this.brand = brand;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "product{" + "id: " + id + ", price: " + price + ", brand: " + brand + '}';
    }

    public void input(Scanner sc) {
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter brand: ");
        brand = sc.nextLine();
    }

    public void output() {
        System.out.println(toString());
    }
}
