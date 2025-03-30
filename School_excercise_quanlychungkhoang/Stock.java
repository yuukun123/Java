package School_excercise_quanlychungkhoang;

public class Stock {
    private String symbol;
    private String name;
    private double price;
    private int volume;

    public Stock() {
    }

    public Stock(String symbol, String name, double price, int volume) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.volume = volume;
    }
    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getVolume() {
        return volume;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "symbol=" + symbol + ", name=" + name + ", price=" + price + ", volume=" + volume ;
    }

    public void display() {
        System.out.print(this.toString());
    }

    public void UpdatePrice(double newPrice) {
        this.price = newPrice;
    }

}
