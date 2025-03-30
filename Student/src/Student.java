import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double score;
    private double avgScore;

    public Student() {

    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public void Input(Scanner sc){
        System.out.print("Enter id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter score: ");
        score = sc.nextDouble();
    }

    public void output(){
        System.out.printf("| Id: %02d | Name: %-4s | Score: %04.1f |\n", id, name, score);
    }
//        System.out.println("Id: " + id + " | " + "Name: " + name + " | " + "Score: " + score);

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}
