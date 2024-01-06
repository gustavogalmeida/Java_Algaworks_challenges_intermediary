package testes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Joseph");
        Student s2 = new Student("Maria");
        Student s3 = new Student("Jhon");

        Set<Student> students = new HashSet<Student>();

        // O Hash tem por padrão salvar de forma não ordenada, então não consigo buscar por indice, por exemplo
        students.add(s1);
        students.add(s2);
        students.add(s3);

        printStudents(students);
    }
    public static void printStudents(Set<Student> students){
        for (Student s : students){
            System.out.println("Name: " + s.getName());
        }
    }
}