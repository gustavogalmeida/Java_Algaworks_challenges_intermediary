import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Student> students = DataBaseSimulator.findStudents();

        // sortear aluno
        Student studentDrawn = new Student(1L, "Pedro");

        if (students.equals(studentDrawn)){
            System.out.println("Congratulations, " + studentDrawn + ", you won a gift!");
        } else {
            System.out.println("Student not registred in the database.");
        }

        // IMPRIMIR TODOS
        //for (Student s : students){
        //    System.out.println("Nome: " + s.getName());
        //}
    }
}