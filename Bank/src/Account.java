import java.text.NumberFormat;
import java.util.Scanner;
import java.util.*;

public class Account implements Manage_Acc {
    private long accountNumber;
    private String accountName;
    private double amount;

    public Account() {

    }

    public Account(long accountNumber, String accountName, double amount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    @Override
    public String toString() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String amount_str = currencyEN.format(amount);
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nAmount: " + amount_str;
    }

    @Override
    public void input(Scanner sc){
        System.out.print("Enter your account number: ");
        accountNumber = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter your account name: ");
        accountName = sc.nextLine();
        System.out.print("Enter your amount: ");
        amount = sc.nextDouble();
    }

    @Override
    public void output(){
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String amount_str = currencyEN.format(amount);
        System.out.printf("| %-20d | %-20s | %-20s |\n", accountNumber, accountName.toUpperCase(), amount_str);
    }

    @Override
    public void depositMoney(Scanner sc) {
        double deposit;
        System.out.println();
        System.out.print("Enter the amount you want to deposit: ");
        deposit = sc.nextDouble();
        sc.nextLine();
        if(deposit > 0){
            amount += deposit;
            System.out.println();
            System.out.println("deposit money success!");
            System.out.println("Your deposit amount is: " + deposit);
            System.out.println("The remaining amount in your account " + accountName.toUpperCase() + " is: " + amount);
        }
        else{
            System.out.println();
            System.out.println("deposit money failed!");
            System.out.println("Your deposit amount is not valid!");
        }
    }

    @Override
    public void withdrawMoney(Scanner sc) {
        double withdraw;
        double withdrawal_fee = 1.100;
        System.out.println();
        System.out.print("Enter the amount you want to withdraw: ");
        withdraw = sc.nextDouble();
        sc.nextLine();
        if(withdraw > 0){
            System.out.println();
            System.out.println("withdraw money success!");
            amount = amount - withdraw - withdrawal_fee;
            System.out.println("Your amount -" + withdrawal_fee);
            System.out.println("The remaining amount in your account " + accountName.toUpperCase() + " is: " + amount);
        }
        else{
            System.out.println();
            System.out.println("withdraw money failed!");
            System.out.println("The remaining amount is: " + amount);
            System.out.println("Your amount is not enough!");
        }
    }

    @Override
    public void transferMoney(Scanner sc) {
        String transfer_str;
        double transfer_number;
        System.out.println();
        System.out.println("Enter the account number you want to transfer: ");
        transfer_str = sc.nextLine();
        if(transfer_str.equals(accountNumber)){
            System.out.println("Enter the amount you want to transfer: ");
            transfer_number = sc.nextDouble();
            if(transfer_number > 0){
                amount = amount - transfer_number;
                System.out.println();
                System.out.println("Transfer money success!");
                System.out.println("The remaining amount is: " + amount);
            }
            else {
                System.out.println();
                System.out.println("Transfer money failed!");
                System.out.println("The remaining amount is: " + amount);
                System.out.println("Your amount is not enough!");
            }
        }
        else{
            System.out.println();
            System.out.println("Can't find account number!");
            System.out.println("Your account number is not correct!");
        }
    }
}
