package testes;

import java.util.*;

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

        printStudentsSet(students);

        // inciar testes com map e hashmap
        Map<Integer, Student> studentsMap = new HashMap<Integer, Student>();
        // esssa declaração do Map<K, V) você especifica o DataType dos mesmos
        // a chave e o valor do MAP são objetos, então não podemos usar tipos primitivos
        // para usar preciso colocar a int no PUT

        studentsMap.put(1, s1);
        studentsMap.put(2, s2);
        int chave3 = 3; // tipo primitivo
        studentsMap.put(chave3, s3); // conforme esse exemplo sobre os tipos primitivos
        studentsMap.put(4, s3); // no map consigo fazer com que um objeto seja referenciado por mais de uma chave;

        printStudentsMap(studentsMap);
    }
    public static void printStudentsSet(Set<Student> students){
        System.out.println("Impressão Set:");
        for (Student s : students){
            System.out.println("Name: " + s.getName());
        }
    }
    public static void printStudentsMap(Map<Integer, Student> students){
        System.out.println("\nImpressão Map:");
        for (Student s : students.values()){
            System.out.println("Nome: " + s.getName());
        }
    }
}