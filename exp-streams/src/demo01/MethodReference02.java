package demo01;

import demo01.beans.Student;

import java.util.List;

public class MethodReference02 {
    public static void main(String[] args) {

        Student robin = new Student("Robin", 20);
        Student franky = new Student("Franky", 25);
        Student nami = new Student("Nami", 18);
        Student brook = new Student("Brook", 45);

        List<Student> students = List.of(robin, nami, franky, brook);

        students.stream()
                .map(student -> student.getAge())
                .forEach(System.out::println);

        students.stream()
                .map(Student::getAge)
                .forEach(System.out::println);
    }
}
