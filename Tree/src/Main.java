import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node();
        int n = 6;
        System.out.println("Enter the number of nodes: ");
        root.setRoot(sc, n);
        System.out.println("NLR: ");
        root.NLR();
        System.out.println();
        System.out.println("LNR: ");
        root.LNR();
        System.out.println();
        System.out.println("LRN: ");
        root.LRN();
        System.out.println();
        System.out.println("Enter value delete: ");
        int k = sc.nextInt();
        sc.nextLine();
        root.delete(k);
        System.out.println("NLR: ");
        root.NLR();

    }
}