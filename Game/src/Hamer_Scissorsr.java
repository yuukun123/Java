import java.util.Scanner;
import java.util.Random;

public class Hamer_Scissorsr {
    Scanner sc = new Scanner(System.in);
    private String[] a = {"keo", "bua", "bao"};

    String n;
    public void input() {
        System.out.print("Enter: ");
        n = sc.next();
    }

    public void output() {
        Random rd = new Random();
        int i = rd.nextInt(a.length);
        System.out.println("Computer: " + a[i]);

        if (n.equals(a[i])) {
            System.out.println("DRAW");
        }
        else if ((n.equals("bua") && a[i].equals("keo")) ||
                (n.equals("bao") && a[i].equals("bua")) ||
                (n.equals("keo") && a[i].equals("bao"))) {
            System.out.println("YOU WIN");
        }
        else {
            System.out.println("YOU LOSE");
        }

    }

    public void closeScanner() {
        sc.close();
    }
}
