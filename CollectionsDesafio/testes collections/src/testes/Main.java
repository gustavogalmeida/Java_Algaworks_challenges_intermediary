package testes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // anteriormente eu poderia criar um array de um objeto dessa forma
        Student[] arrayStudents = new Student[5];

        /* collections veio para resolver esse problema da seguinte forma */
        List v1Students = new ArrayList(); // mas será que essa é a melhor forma?

        // ainda podemos melhorar essa collection implementando os tipos genericos GENERICS
        List<Student> v2Students = new ArrayList<Student>();

    }
}