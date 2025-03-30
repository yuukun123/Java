package School_exercise_electronics;

import java.util.Scanner;

public class audio extends product {
    private int powerOutput;
    private int frequencyResponse;
    private String wireless;

    public audio() {
        super();
    }

    public audio(int id, double price, String brand, int powerOutput, int frequencyResponse, String wireless) {
        super(id, price, brand);
        this.powerOutput = powerOutput;
        this.frequencyResponse = frequencyResponse;
        this.wireless = wireless;
    }

    public int getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    public int getFrequencyResponse() {
        return frequencyResponse;
    }

    public void setFrequencyResponse(int frequencyResponse) {
        this.frequencyResponse = frequencyResponse;
    }

    public String getWireless() {
        return wireless;
    }

    public void setWireless(String wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "audio [id=" + getId() + ", price=" + getPrice() + ", brand=" + getBrand() + ", powerOutput=" + powerOutput
                + ", frequencyResponse=" + frequencyResponse + ", wireless=" + wireless + "]";
    }

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter power output: ");
        powerOutput = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter frequency response: ");
        frequencyResponse = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter wireless: ");
        wireless = sc.nextLine();
    }

    public void output() {
        System.out.println(toString());
    }
}
