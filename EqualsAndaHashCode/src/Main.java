import java.util.Set;

public class Main {
    public static void main(String[] args){
        Set<Student> students = DataBaseSimulator.findStudents();
        for (Student s : students){
            System.out.println("Nome: " + s.getName());
        }
    }
}