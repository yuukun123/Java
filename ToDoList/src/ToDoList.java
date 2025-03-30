import java.util.Scanner;

public class ToDoList {
    private String task;
    private String description;
    private String deadline;
    private boolean completed;

    Scanner sc = new Scanner(System.in);

    public ToDoList() {

    }

    public ToDoList(String task, String description, String deadline, String time, boolean completed) {
        this.task = task;
        this.description = description;
        this.deadline = deadline;
        this.completed = completed;
    }

    public String getTask() {
        return task;
    }

    public String getDescription() {
        return description;
    }

    public String getDeadline() {
        return deadline;
    }

    public  boolean getCompleted() {
        return completed;
    }


    public void setTask(String task) {
        this.task = task;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void input(Scanner sc) {
        System.out.print("Enter task: ");
        task = sc.nextLine();
        System.out.print("Enter description: ");
        description = sc.nextLine();
        System.out.print("Enter deadline: ");
        deadline = sc.nextLine();
    }

    public void print() {
//        System.out.println("Task: " + task);
//        System.out.println("Description: " + description);
//        System.out.println("Deadline: " + deadline);
//        System.out.println("Completed: " + (completed ? "Yes" : "No"));
        System.out.printf("|  Task: %-10s  |  Description: %-10s  |  Deadline: %-10s  |  Status: %-13s  |\n", task, description, deadline, completed ? "Completed" : "Not Completed");
    }


    public String toString() {
        return task + " " + description + " " + deadline + " " + completed;
    }

    public int count() {
        int cnt = 0;
        for(int i = 0; i < toString().length(); i++) {
            cnt++;
        }
        return cnt;
    }

    public void show() {
        for(int i = 0; i <= count() + 80; i++) {
            System.out.printf("%s",'-');
        }
    }

    public void update(Scanner sc) {
        System.out.print("Enter new task: ");
        task = sc.nextLine();
        System.out.print("Enter new description: ");
        description = sc.nextLine();
        System.out.print("Enter new deadline: ");
        deadline = sc.nextLine();
    }

    public void complete() {
        completed = true;
    }

    public void uncomplete() {
        completed = false;
    }

    public void search() {
        task = sc.nextLine();
    }

    public void delete() {
        task = null;
        description = null;
        deadline = null;
        completed = false;
    }


}
