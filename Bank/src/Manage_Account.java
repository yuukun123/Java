import java.util.*;

public class Manage_Account implements Manage_Funtion {
    private ArrayList<Account> accList;

    public Manage_Account() {
        accList = new ArrayList<>(10);
    }

    public void addAccount(Account acc) {
        accList.add(acc);
    }

    @Override
    public void addList(Scanner sc) {
        Account acc;
        System.out.println();
        System.out.print("Enter the number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Account " + (i+1) + ": ");
            acc = new Account();
            acc.input(sc);
            addAccount(acc);
        }
    }

    @Override
    public void showList() {
        System.out.println();
        System.out.printf("+ %-20s | %-20s | %-20s +\n", "Account Number", "Account Name", "Amount");
        for(Account acc : accList) {
            acc.output();
        }
    }

    @Override
    public boolean findAccount_Name(String name) {
        for(Account acc : accList) {
            if(name.equals(acc.getAccountName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findAccount_Number(long name) {
        for(Account acc : accList) {
            if(name == acc.getAccountNumber()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addAccount(Scanner sc) {
        Account acc;
        System.out.println();
        System.out.print("Enter account number: ");
        long find = sc.nextLong();
        if(findAccount_Number(find)) {
            System.out.println("This " + find + " account is already have in list.");
        }
        else {
            System.out.println("this " + find + " account is not have in list. You can add this account ");
            System.out.println();
            acc = new Account();
            acc.input(sc);
            addAccount(acc);
            System.out.println("Add Success");
        }
    }

    @Override
    public void SortList() {
        Collections.sort(accList, new Comparator<Account>() {
            @Override
            public int compare(Account o1, Account o2) {
                return Long.compare(o1.getAccountNumber(), o2.getAccountNumber());
            }
        });
    }

    @Override
    public void deposit_money(Scanner sc) {
        long name = sc.nextLong();
        boolean found1 = false;
        for(Account acc : accList) {
            if (findAccount_Number(name)) {
                acc.depositMoney(sc);
                found1 = true;
                break;
            }
        }
        if(!found1) {
            System.out.println("Not found this " + name + " acount in list");
        }
    }

    @Override
    public void withdraw_money(Scanner sc) {
        long name = sc.nextLong();
        boolean found2 = false;
        for(Account acc : accList) {
            if(findAccount_Number(name)) {
                System.out.println("Enter amount you want to withdraw: ");
                acc.withdrawMoney(sc);
                found2 = true;
                break;
            }
        }
        if(!found2) {
            System.out.println("Not found this " + name + " acount in list");
        }
    }

    @Override
    public void transfer_money(Scanner sc) {
        long name = sc.nextLong();
        boolean found3 = false;
        for(Account acc : accList) {
            if(findAccount_Number(name)) {
                acc.getAccountName();
                acc.transferMoney(sc);
                found3 = true;
                break;
            }
        }

        if (!found3) {
            System.out.println("Not found this " + name + " acount in list");
        }
    }

    @Override
    public boolean isEmpty() {
        return accList.isEmpty();
    }

    @Override
    public void deleteAccount(Scanner sc) {
        long name = sc.nextLong();
        boolean found4 = false;
        for(Account acc : accList) {
            if(findAccount_Number(name)) {
                accList.remove(acc);
                found4 = true;
                break;
            }
        }
        if(!found4) {
            System.out.println("Not found this " + name + " acount in list");
        }
    }
}
