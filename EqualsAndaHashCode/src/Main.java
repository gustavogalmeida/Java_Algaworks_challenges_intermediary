import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Student> students = DataBaseSimulator.findStudents();

        // Drawn Student
        Student studentDrawn = new Student(1L, "Pedro");

        if (students.contains(studentDrawn)){
            System.out.println("Congratulations, " + studentDrawn.getName() + ", you won a gift!");
        } else {
            System.out.println("Student not registred in the database.");
        }

        // print everybody
        //for (Student s : students){
        //    System.out.println("Nome: " + s.getName());
        //}
    }
}