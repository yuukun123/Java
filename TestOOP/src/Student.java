import java.util.Scanner;

public interface Student {

    public void input(Scanner sc);
    public void output();

    //  abstract method in interface
    public int getId();
    public String getName();
    public double getScore();

    public void setId(int id);
    public void setName(String name);
    public void setScore(double score);

    public String toString();
}
