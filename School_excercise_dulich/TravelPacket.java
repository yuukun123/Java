package School_excercise_dulich;

import java.util.*;

public abstract class TravelPacket implements Bookable, PacketService{
    protected String name;
    protected double price;
    protected List<String> extraServices = new ArrayList<>();

    public TravelPacket(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void display() {
        System.out.println("Package Name: " + name);
        System.out.println("Price: $" + price);
        if (!extraServices.isEmpty()) {
            System.out.println("Extra Services: " + String.join(", ", extraServices));
        } else {
            System.out.println("No extra services included.");
        }
    }

    @Override
    public void addExtra(String extraService) {
        extraServices.add(extraService);
        System.out.println("Added extra service: " + extraService);
    }

    public abstract void bookTransport();
    public abstract void bookAccommodation();
    public abstract void displayExtraServices();
}
