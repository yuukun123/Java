package School_excercise_quanlysv;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Trung", 3.5);
        Student student1 = new Student("Thu", 3.4);
        student.display();
        student1.display();

        System.out.println("So hoc sinh: " + Student.getStudentdCnt());
        System.out.println("Trung binh diem: " + Student.getAvgGPA());
    }
}
