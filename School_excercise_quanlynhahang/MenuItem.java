package School_excercise_quanlynhahang;

public class MenuItem {
    private int id;
    private String name;
    private double price;
    private String description;

    public MenuItem(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String toString() {
        return "id=" + id + '\'' +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'';
    }

}
