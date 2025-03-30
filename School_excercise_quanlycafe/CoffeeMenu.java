package School_excercise_quanlycafe;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMenu {
    private List<Coffee> listCoffee;

    public CoffeeMenu() {
        listCoffee = new ArrayList<>();
    }

    public List<Coffee> getListCoffee() {
        return listCoffee;
    }

    public void setListCoffee(List<Coffee> listCoffee) {
        this.listCoffee = listCoffee;
    }

    public void addCoffee(Coffee coffee) {
        listCoffee.add(coffee);
    }

    public void display() {
        for (Coffee coffee : listCoffee) {
            System.out.println(coffee.toString());
        }
    }
}
