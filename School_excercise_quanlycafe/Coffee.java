package School_excercise_quanlycafe;

public class Coffee {
    private String name;
    private double price;
    private String type;

    public Coffee() {
        this.name = "";
        this.price = 0;
        this.type = "";
    }

    public Coffee(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        String result =
                "name= " + name +
                ", price= " + price +
                ", type= " + type;

        return result;
    }

    public void display() {
        System.out.println(toString());
    }

}
