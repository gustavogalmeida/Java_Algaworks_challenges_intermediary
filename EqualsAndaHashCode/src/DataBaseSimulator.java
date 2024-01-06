import java.util.Set;
import java.util.HashSet;
public class DataBaseSimulator {
    public static Set<Student> findStudents(){
        Set<Student> students = new HashSet<Student>();
        students.add(new Student("Pedro"));
        students.add(new Student("Thiago"));
        students.add(new Student("João"));
        return students;
    }
}
