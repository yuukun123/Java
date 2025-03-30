package School_excercise_quanlythuongmaidientu;

public class Digital_product extends Product {
    private String brand;
    private String model;
    private int warrantyMonth;

    public Digital_product(String productID, String productName, int quantity, double price, String brand, String model, int warrantyMonth) {
        super(productID, productName, quantity, price);
        this.brand = brand;
        this.model = model;
        this.warrantyMonth = warrantyMonth;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWarrantyMonth() {
        return warrantyMonth;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWarrantyMonth(int warrantyMonth) {
        this.warrantyMonth = warrantyMonth;
    }

    public String getCategory() {
        return "Digital product";
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Model: " + model + ", Warranty Month: " + warrantyMonth;
    }
}
