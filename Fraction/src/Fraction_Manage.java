import java.util.Scanner;
import java.util.ArrayList;

public class Fraction_Manage {
    Scanner sc = new Scanner(System.in);

    private ArrayList<Fraction> frct;

    public Fraction_Manage() {
        frct = new ArrayList<>(10); // Initial capacity of 10, no change needed here
    }

    public void addFraction(Fraction fr) {
        frct.add(fr);
    }

    public void addList(Scanner sc) {
        System.out.print("Enter the number of fractions: ");
        int n = sc.nextInt();
        System.out.println("Enter list of fractions: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Fraction " + (i + 1) + ": ");
            Fraction fr = new Fraction();
            fr.input(sc);  // Pass the Scanner object to the input method
            addFraction(fr);
        }
    }

    public void showList() {
        for (Fraction fr : frct) {
            fr.output();
        }
    }

    public void Sum_Fraction() {
        if (frct.isEmpty()) {
            System.out.println("No fractions to sum.");
            return;
        }

        Fraction sum = frct.get(0); // Start with the first fraction
        for (int i = 1; i < frct.size(); i++) {
            sum = sum.add(frct.get(i)); // Add each subsequent fraction to the sum
        }

        System.out.print("Sum of fractions: ");
        sum.output();
        System.out.print("Sum of fractions simplified: ");
        sum.Simplify_Fraction(); // Simplify the resulting sum
        sum.output_Simplified(); // Output the sum
    }
}
