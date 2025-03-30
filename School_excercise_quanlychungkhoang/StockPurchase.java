package School_excercise_quanlychungkhoang;

public class StockPurchase implements Transaction{
    private Stock stock;
    private int quantity;
    private Investor investor;

    public StockPurchase(Stock stock, int quantity, Investor investor) {
        this.stock = stock;
        this.quantity = quantity;
        this.investor = investor;
    }

    @Override
    public void registerOrder() {
        System.out.println("Registered purchase order for " + quantity +
                " shares of " + stock.getSymbol());
    }

    @Override
    public void executeOrder() {
        investor.buyStock(stock, quantity);
    }
}
