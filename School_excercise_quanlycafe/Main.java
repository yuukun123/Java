package School_excercise_quanlycafe;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setName("Cappucino");
        coffee.setType("Latte");
        coffee.setPrice(100);

        Coffee coffee1 = new Coffee();
        coffee1.setName("Espresso");
        coffee1.setType("Cappucino");
        coffee1.setPrice(50);

        CoffeeMenu coffeeMenu = new CoffeeMenu();
        coffeeMenu.addCoffee(coffee);
        coffeeMenu.addCoffee(coffee1);
        coffeeMenu.display();
    }
}
