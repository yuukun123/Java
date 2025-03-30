
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manage_Account manage = new Manage_Account();

        int option;
        do{
            System.out.println();
            System.out.println();
            System.out.println("==============MENU==============");
            System.out.println("\t1. Add account");
            System.out.println("\t2. Show list account");
            System.out.println("\t3. Sort list account number");
            System.out.println("\t4. Add account");
            System.out.println("\t5. Deposit");
            System.out.println("\t6. Withdraw");
            System.out.println("\t7. Transfer");
            System.out.println("\t8. Delete account");
            System.out.println("\t0. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1:
                    manage.addList(sc);
                    break;
                case 2:
                    manage.showList();
                    break;
                case 3:
                    if(manage.isEmpty()) {
                        System.out.println("List is empty");
                    }
                    else {
                        manage.SortList();
                        System.out.println("List after sort: ");
                        manage.showList();
                    }
                    break;
                case 4:
                    manage.addAccount(sc);
                    break;
                case 5:
                    System.out.print("Enter account number you want to deposit: ");
                    manage.deposit_money(sc);
                    break;
                case 6:
                    System.out.print("Enter account number you want to withdraw: ");
                    manage.withdraw_money(sc);
                    break;
                case 7:
                    manage.transfer_money(sc);
                    break;
                case 8:
                System.out.print("Enter account number you want to delete: ");
                manage.deleteAccount(sc);
                break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while(true);

    }
}