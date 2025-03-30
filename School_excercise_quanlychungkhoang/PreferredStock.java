package School_excercise_quanlychungkhoang;

public class PreferredStock extends Stock{
    private double annualDividend;
    public PreferredStock(String symbol, String name, double price, int volume, double annualDividend) {
        super(symbol, name, price, volume);
        this.annualDividend = annualDividend;
    }

    public double getAnnualDividend() {
        return annualDividend;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", Annual Dividend: " + getAnnualDividend());
    }
}
