package School_excercise_quanlychungkhoang;

public class SellOrder implements Transaction{
    private Stock stock;
    private int quantity;

    public SellOrder(Stock stock, int quantity) {
        this.stock = stock;
        this.quantity = quantity;
    }

    @Override
    public void registerOrder() {
        // TODO Auto-generated method stub
        System.out.println("Registered sell order for " + quantity + " shares of " + stock.getSymbol());
    }

    @Override
    public void executeOrder() {
        if(stock.getVolume() >= quantity) {
            stock.setVolume(stock.getVolume() - quantity);
            System.out.println("Sold " + quantity + " shares of " + stock.getSymbol());
        } else {
            System.out.println("Not enough shares to sell.");
        }
    }
}
