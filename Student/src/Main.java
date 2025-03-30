import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student_management StM = new Student_management();

        int option;
        do {
            System.out.println();
            System.out.println("=========MENU=========");
            System.out.println("1. Add List Student");
            System.out.println("2. Output List Student");
            System.out.println("3. Find Student");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();
            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.println();
                    StM.addList(sc);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("List Student: ");
                    System.out.print("--------------------------------------\n");
                    StM.showList();
                    System.out.print("--------------------------------------\n");

                    break;
                case 3:
                    System.out.println();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    StM.findStudent(name);
                    break;
            }
        } while (option != 0);
    }
}