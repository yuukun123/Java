import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean found = false;
        ToDoList[] todo = null;
        int option;
        do {
            System.out.println();
            System.out.println();
            System.out.println("==========MENU==========");
            System.out.println("1. Add List ToDoList");
            System.out.println("2. Output List ToDoList");
            System.out.println("3. Find ToDoList");
            System.out.println("4. Update ToDoList");
            System.out.println("5. Delete ToDoList");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println();
                    System.out.print("Enter number of ToDoList: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    todo = new ToDoList[n];
                    for (int i = 0; i < n; i++) {
                        todo[i] = new ToDoList();
                        System.out.println();
                        System.out.println("Enter ToDoList " + (i + 1));
                        todo[i].input(sc);
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("To Do List");

                    ToDoList toDo0 = new ToDoList();
                    int cnt_not = 0;
                    int cnt_yes = 0;
                    boolean complete = false;
                    toDo0.show();
                    if (todo == null || todo.length == 0) {
                        System.out.println();
                        System.out.println("Your list is empty");
                    } else {
                        for (int i = 0; i < todo.length; i++) {
                            if (todo[i] != null && !(todo[i].getCompleted())) {
                                cnt_not++;
                                complete = true;

                            }
                            if (todo[i] != null && (todo[i].getCompleted())) {
                                cnt_yes++;
                                complete = false;
                            }

                        }
                        for (int i = 0; i < todo.length; i++) {
                            if (todo[i] != null) {
                                System.out.println();
                                System.out.printf("%s %42d. %11s  %42s\n", '+', i + 1, todo[i].getTask().toUpperCase(), '+');
                                todo[i].print();
                            }
                        }

                    }
                    toDo0.show();
                    System.out.println();
                    if (complete && cnt_not > 0) {
                        System.out.println();
                        System.out.println("You have " + cnt_not + " task not completed ");
                    } else if (!complete && cnt_yes > 0) {
                        System.out.println();
                        System.out.println("You have " + cnt_yes + " task completed ");
                    }
                    break;
                case 3:
                    System.out.println();
                    ToDoList toDo1 = new ToDoList();

                    if (todo == null || todo.length == 0) {
                        toDo1.show();
                        System.out.println();
                        System.out.println("Your list is empty");
                        toDo1.show();
                    }

                    System.out.println();
                    if (todo != null) {
                        System.out.print("Enter task to find: ");
                        toDo1.search();

                        System.out.print("Is the task completed? ");
                        String completed = sc.next();

                        System.out.println();
                        toDo1.show();
                        for (int i = 0; i < todo.length; i++) {
                            if (todo[i] != null && todo[i].getTask().equals(toDo1.getTask())) {
                                if (completed.equals("yes")) {
                                    found = true;
                                    todo[i].complete();
                                    System.out.println();
                                    todo[i].print();
                                    System.out.println("Task " + todo[i].getTask().toUpperCase() + " completed");
                                } else {
                                    System.out.println();
                                    found = true;
                                    todo[i].uncomplete();
                                    System.out.println();
                                    todo[i].print();
                                    System.out.println("Task " + todo[i].getTask().toUpperCase() + " not completed");
                                }
                            }
                        }
                        if (!found) {
                            System.out.println("Task not found");
                        }
                        toDo1.show();
                    }

                    break;
                case 4:
                    System.out.println();
                    ToDoList toDo2 = new ToDoList();

                    toDo2.show();
                    if (todo == null || todo.length == 0) {
                        System.out.println();
                        System.out.println("Your list is empty");
                    }
                    toDo2.show();

                    System.out.println();
                    if (todo != null) {
                        System.out.print("Enter task want to update: ");
                        toDo2.search();
                        found = false;

                        for (int i = 0; i < todo.length; i++) {
                            if (todo[i] != null && todo[i].getTask().equals(toDo2.getTask())) {
                                found = true;
                                System.out.println();
                                todo[i].update(sc);
                            }
                        }
                        if (!found) {
                            System.out.println("Task not found");
                        }
                    }
                    break;
                case 5:
                    System.out.println();
                    ToDoList toDo5 = new ToDoList();

                    toDo5.show();
                    if (todo == null || todo.length == 0) {
                        System.out.println();
                        System.out.println("Your list is empty");
                    }
                    toDo5.show();

                    if (todo != null) {
                        for (int i = 0; i < todo.length; i++) {
                            if (todo[i] != null) {
                                System.out.println();
                                System.out.printf("%s %42d. %11s  %42s\n", '+', i + 1, todo[i].getTask().toUpperCase(), '+');
                                todo[i].print();
                            }
                        }

                        toDo5.show();

                        System.out.println();
                        System.out.println();
                        System.out.print("Enter task to delete: ");
                        ToDoList todo3 = new ToDoList();
                        todo3.search();
                        System.out.print("Are you sure you want to delete this task? : ");
                        String answer = sc.nextLine();

                        found = false;

                        toDo5.show();
                        for (int i = 0; i < todo.length; i++) {
                            if (todo[i].getTask().equals(todo3.getTask()) && answer.equals("yes")) {
                                todo[i] = null;
                                found = true;
                            } else {
                                System.out.println();
                                System.out.printf("%s %42d. %11s  %42s\n", '+', i + 1, todo[i].getTask().toUpperCase(), '+');
                                todo[i].print();
                                found = true;
                            }
                        }
                        toDo5.show();

                        if (!found) {
                            System.out.println("Task not found");
                        }
                        if (answer.equals("yes")) {
                            System.out.println("Deleting task..............");
                            System.out.println("Delete completed");
                            System.out.println("Task " + todo3.getTask().toUpperCase() + " is deleted");
                        } else {
                            System.out.println();
                            System.out.println("Delete cancelled");
                            System.out.println("Task not deleted");
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exit program!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option!");
            }
        } while (true);
    }
}