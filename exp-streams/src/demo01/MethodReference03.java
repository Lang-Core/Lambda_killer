package demo01;

import demo01.beans.Student;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReference03 {
    public static void main(String[] args) {

        List<String> names = List.of("Brook", "Robin", "Franky", "Nami");
        List<Student> studentList = names.stream()
                .map(name -> new Student(name))
                .collect(Collectors.toList());

        List<Student> list = names.stream()
                .map(Student::new)
                .collect(Collectors.toList());

    }
}
