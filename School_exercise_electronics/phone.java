package School_exercise_electronics;

import java.util.Scanner;

public class phone extends product {
    private int screenSize;
    private int cameraResolution;
    private int battery;

    public phone() {
        super();
    }

    public phone(int id, double price, String brand, int screenSize, int cameraResolution, int battery) {
        super(id, price, brand);
        this.screenSize = screenSize;
        this.cameraResolution = cameraResolution;
        this.battery = battery;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "phone{" + "id: " + getId() + ", price: " + getPrice() + ", brand: " + getBrand() + ", screenSize: " + screenSize + ", cameraResolution: " + cameraResolution + ", battery: " + battery + '}';
    }

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter screenSize: ");
        screenSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter cameraResolution: ");
        cameraResolution = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter battery: ");
        battery = sc.nextInt();
        sc.nextLine();
    }
}
