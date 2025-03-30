import java.util.Scanner;

public class Manage_STD implements Student {
    private int id;
    private String name;
    private double score;
    Scanner sc = new Scanner(System.in);

    public Manage_STD() {

    }

    public Manage_STD(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public void input(Scanner sc) {
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter score: ");
        score = sc.nextDouble();
    }

    @Override
    public void output() {
        System.out.println(toString());
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getScore() {
        return score;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("| Id: %02d | Name: %-4s | Score: %04.1f |\n", id, name, score);
    }
}
