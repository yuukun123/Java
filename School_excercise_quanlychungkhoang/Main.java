package School_excercise_quanlychungkhoang;

public class Main {
    public static void main(String[] args) {
        CommonStock commonStock = new CommonStock("GOOGL", "Google", 1000, 100);
        commonStock.UpdatePrice(1100);
        commonStock.display();
        System.out.println();

        PreferredStock preferredStock = new PreferredStock("MSFT", "Microsoft", 1000, 100, 2.0);
        preferredStock.UpdatePrice(1100);
        preferredStock.display();
        System.out.println();

        Investor investor = new Investor("A01", "John Doe");
        investor.buyStock(preferredStock, 10);
        investor.buyStock(commonStock, 10);
        investor.displayPortfolio();
        System.out.println();

        investor.sellStock(preferredStock, 5);
        investor.displayPortfolio();
        System.out.println();

    }
}
