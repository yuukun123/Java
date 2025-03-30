package School_exercise.quanlytaichinh;

import java.util.ArrayList;
import java.util.Scanner;

public class list {

    ArrayList<Transaction> list = new ArrayList<>(10);

    public void AddList(Transaction trs) {
        list.add(trs);
    }

    public void input(Scanner sc) {
        Transaction trs;
        System.out.println();
        System.out.print("Enter the number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Transaction " + (i+1) + ": ");
            trs = new Transaction();
            trs.input(sc);
            AddList(trs);
        }
    }

    public void output() {
        System.out.println();
        System.out.printf("+ %-20s | %-20s | %-20s +\n", "Account Number", "Type", "Amount");
        for(Transaction trs : list) {
            trs.output();
        }
    }

    public void sum_money() {
        double sum_thu = 0, sum_chi = 0;
        for(int i = 0; i < list.size(); i++) {
            Transaction trs = list.get(i);
            if(trs.getType().equals("thu"))
                sum_thu += trs.getAmount();
            if(trs.getType().equals("chi"))
                sum_chi += trs.getAmount();
        }
        double sum = sum_thu - sum_chi;
        System.out.println();
        System.out.println("Tổng số tiền thu: " + sum_thu);
        System.out.println("Tổng số tiền chi: " + sum_chi);
        System.out.println("Tổng số tiền: " + sum);
    }
}
