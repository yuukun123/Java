import java.util.*;

public interface Manage_Funtion {
    // region Manage_Funtion
    public void addList(Scanner sc);
    public void showList();
    public void deleteAccount(Scanner sc);
    public void SortList();
    public boolean findAccount_Name(String name);
    public boolean findAccount_Number(long name);
    public void addAccount(Scanner sc);
    public void deposit_money(Scanner sc);
    public void withdraw_money(Scanner sc);
    public void transfer_money(Scanner sc);
    public boolean isEmpty();

}
