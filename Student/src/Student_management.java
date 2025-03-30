import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Student_management {
    private ArrayList<Student> dssv; // Specify the type as Student

    public Student_management() {
        dssv = new ArrayList<>(10); // No change needed here
    }

    public void addStudent(Student sv) {
        dssv.add(sv);
    }

    public void addList(Scanner sc){
        Student sv;

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        System.out.println("Enter list student: ");
        for(int i = 0; i < n; i++){
            System.out.println("Student " + (i+1) + ": ");
            sv = new Student();
            sv.Input(sc);
            addStudent(sv);
        }
    }

    public void showList() {
        for(Student sv : dssv){
            sv.output();
        }
    }

    public void findStudent(String name){
        for(Student sv : dssv){ // Now this will work correctly
            if(name.equals(sv.getName())){
                sv.output();
            }
        }
    }


}
