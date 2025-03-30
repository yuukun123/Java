import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction_Manage manage = new Fraction_Manage();
        manage.addList(sc);
        manage.showList();
        manage.Sum_Fraction();
    }
}