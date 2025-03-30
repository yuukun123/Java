package School_excercise;

import java.util.Scanner;

public class Developer extends Person{
    private String language;

    public Developer() {
        super();
        language = "";
    }

    public Developer(String name, int age, double salary, String language) {
        super(name, age, salary);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void display() {
        super.display();
        System.out.println("Language: " + language);
    }

    public void input(Scanner sc) {
        super.input(sc);
        System.out.print("Enter language: ");
        language = sc.nextLine();
    }

}
