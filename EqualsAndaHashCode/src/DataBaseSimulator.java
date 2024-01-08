import java.util.Set;
import java.util.HashSet;
public class DataBaseSimulator {
    public static Set<Student> findStudents(){
        Set<Student> students = new HashSet<Student>();
        students.add(new Student(1L, "Pedro"));
        students.add(new Student(2L, "Thiago"));
        students.add(new Student(3L, "João"));
        return students;
    }
}
