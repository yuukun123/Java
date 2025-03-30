package School_excercise_quanlythuongmaidientu;

public class Service_product extends Product {
    private String type;
    private String usage;
    private String expiryDate;

    public Service_product(String productID, String productName, int quantity, double price, String type, String usage, String expiryDate) {
        super(productID, productName, quantity, price);
        this.type = type;
        this.usage = usage;
        this.expiryDate = expiryDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCategory() {
        return "Service";
    }

    @Override
    public String toString() {
        return super.toString() + ", type=" + type + ", usage : " + usage + ", expiryDate : " + expiryDate;
    }
}
