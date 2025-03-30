import java.util.Scanner;

public class Fraction {
    private double numerator;
    private double denominator;

    public Fraction() {

    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double getNumerator() {
        return numerator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    public void input(Scanner sc){
        System.out.print("Enter numerator: ");
        numerator = sc.nextDouble();
        System.out.print("Enter denominator: ");
        denominator = sc.nextDouble();
    }

    public void output() {
        System.out.println(numerator + "/" + denominator);
    }

    public void output_Simplified() {
        if(getNumerator() % getDenominator() == 0){
            System.out.println(1);
        } else{
            System.out.println(numerator + "/" + denominator);
        }
    }

    public double Greatest_Common_Denominator(double a, double b) {
        while (a != b){
            if(a > b){
                a -= b;
            } else{
                b -= a;
            }
        }
        return a;
    }

    public void Simplify_Fraction() {
        Fraction fr = new Fraction(numerator, denominator);
        double gcd = Greatest_Common_Denominator(fr.getDenominator(), fr.getDenominator());
        fr.setNumerator(fr.getNumerator() / gcd);
        fr.setDenominator(fr.getDenominator() / gcd);
    }

    public Fraction add(Fraction fraction) {
        Fraction fr = new Fraction();
        fr.setNumerator(this.getNumerator() * fraction.getDenominator() + fraction.getNumerator() * this.getDenominator());
        fr.setDenominator(this.getDenominator() * fraction.getDenominator());
        return fr;
    }
}
