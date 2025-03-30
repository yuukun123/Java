package School_excercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        Scanner sc = new Scanner(System.in);
        manager.input(sc);

        manager.display();

        Developer developer = new Developer();
        developer.input(sc);
        developer.display();
    }
}
