package School_excercise_quanlysv;

public class Student {
    private static int studentdCnt = 0;
    private static double totalGPA = 0;

    private int studentID;
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.studentID = studentdCnt++;
        this.name = name;
        this.gpa = gpa;
        totalGPA += gpa;
    }

    public static int getStudentdCnt() {
        return studentdCnt;
    }

    public static double getAvgGPA() {
        return totalGPA / studentdCnt;
    }

    public void display() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
    }
}
