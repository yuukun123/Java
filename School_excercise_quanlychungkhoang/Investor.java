package School_excercise_quanlychungkhoang;

import java.util.ArrayList;

public class Investor {
    private String investorID;
    private String name;
    private ArrayList<Stock> portfolio;

    public Investor(String investorID, String name) {
        this.investorID = investorID;
        this.name = name;
        this.portfolio = new ArrayList<>();
    }

    public String getInvestorID() {
        return investorID;
    }
    public void setInvestorID(String investorID) {
        this.investorID = investorID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stock> getPortfolio() {
        return portfolio;
    }
    public void setPortfolio(ArrayList<Stock> portfolio) {
        this.portfolio = portfolio;
    }

    public void addStock(Stock stock) {
        portfolio.add(stock);
    }

    public void sellStock(Stock stock, int quantity) {
        if (stock.getVolume() >= quantity) {
            stock.setVolume(stock.getVolume() - quantity);
            System.out.println(name + " has sold " + quantity + " shares of " + stock.getSymbol());
        } else {
            System.out.println("Not enough shares to sell.");
        }
    }

    public void buyStock(Stock stock, int quantity) {
        stock.setVolume(stock.getVolume() + quantity);
        addStock(stock);
        System.out.println(name + " has bought " + quantity + " shares of " + stock.getSymbol());
        System.out.println();
    }

    public void displayPortfolio() {
        System.out.println("Investor: " + name + "'s Portfolio" + "(Id: " + investorID + ")");
        if(portfolio.isEmpty()) {
            System.out.println("Portfolio is empty");
            return;
        }
        for (Stock stock : portfolio) {
            stock.display();
        }
        System.out.println();
    }

}
