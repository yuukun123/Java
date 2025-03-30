package School_exercise.quanlytaichinh;

import java.util.Scanner;

public class Transaction {
    private int acc_num;
    private String type;
    private double amount;

    public Transaction() {
    }

    public Transaction(int acc_num, String type, double amount) {
        this.acc_num = acc_num;
        this.type = type;
        this.amount = amount;
    }

    public int getAcc_num() {
        return acc_num;
    }
    public String getType() {
        return type;
    }
    public double getAmount() {
        return amount;
    }

    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void input(Scanner sc) {
        System.out.print("Enter the account number: ");
        acc_num = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the type: ");
        type = sc.nextLine();
        System.out.print("Enter the amount: ");
        amount = sc.nextDouble();
    }

    public void output() {
        System.out.printf("| %-20d | %-20s | %-20s |\n", acc_num, type, amount);
    }
    
}
