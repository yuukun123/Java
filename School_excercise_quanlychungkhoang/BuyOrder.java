package School_excercise_quanlychungkhoang;

public class BuyOrder implements Transaction {
    private Stock stock;
    private int quantity;
    public BuyOrder(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }
    @Override
    public void registerOrder() {
        System.out.println("Registered purchase order for " + quantity + " shares of " + stock.getSymbol());
    }
    @Override
    public void executeOrder() {
        System.out.println("Executing purchase order for " + stock.getSymbol());
        stock.setVolume(stock.getVolume() + quantity);
    }

}
