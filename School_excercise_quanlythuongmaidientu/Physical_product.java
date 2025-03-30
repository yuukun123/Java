package School_excercise_quanlythuongmaidientu;

public class Physical_product extends Product {
    private String size;
    private String color;
    private String material;

    public Physical_product(String productID, String productName, int quantity, double price, String type, String material, String color, String size) {
        super(productID, productName, quantity, price);
        this.size = size;
        this.color = color;
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCategory() {
        return "physical";
    }


    @Override
    public String toString() {
        return super.toString() + ", size: " + size + ", color: " + color + ", material: " + material;
    }

}
