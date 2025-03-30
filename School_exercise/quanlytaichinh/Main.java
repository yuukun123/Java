package School_exercise.quanlytaichinh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        list list = new list();

        list.input(sc);
        list.output();
        list.sum_money();
    }
}
