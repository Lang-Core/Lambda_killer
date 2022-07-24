package demo01;

import demo01.beans.Student;

import java.util.List;

public class MethodReference01 {
    public static void main(String[] args) {

        Student robin = new Student("Robin", 20);
        Student franky = new Student("Franky", 25);
        Student nami = new Student("Nami", 18);
        Student brook = new Student("Brook", 45);

        List<Student> students = List.of(robin, nami, franky, brook);

        students.forEach(student -> System.out.println(student));

        students.forEach(System.out::println);
    }
}
