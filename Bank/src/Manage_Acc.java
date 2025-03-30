import java.util.Scanner;

public interface Manage_Acc {
    // region Account
    public void input(Scanner sc);
    public void output();
    public void depositMoney(Scanner sc);
    public void withdrawMoney(Scanner sc);
    public void transferMoney(Scanner sc);
}
