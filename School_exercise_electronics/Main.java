package School_exercise_electronics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        computer c = new computer();
        c.input(new Scanner(System.in));
        c.output();

        phone p = new phone();
        p.input(new Scanner(System.in));
        p.output();

        audio a = new audio();
        a.input(new Scanner(System.in));
        a.output();
    }
}
