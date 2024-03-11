package bitlab.techorda.g1.springfirst.db;

import bitlab.techorda.g1.springfirst.model.Developer;
import bitlab.techorda.g1.springfirst.model.Student;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class DbStudentManager {

    @Getter
    private static List<Student> studentList = new ArrayList<>();
    private static Long id = 8L;
    static {
        studentList.add(new Student(1L, "Tilivaldi", "Amrayev", 89, "B"));
        studentList.add(new Student(2L, "Daryn", "D", 94, "A"));
        studentList.add(new Student(3L, "Daulet", "D", 89, "B"));
        studentList.add(new Student(4L, "Dina", "D", 96, "A"));
        studentList.add(new Student(5L, "Gulshat", "D", 91, "A"));
        studentList.add(new Student(6L, "Nurzhan", "N", 49, "F"));
        studentList.add(new Student(7L, "Sabina", "A", 51, "D"));
    }

    public static void createStudent(Student student) {
        student.setId(id);
        id++;
        studentList.add(student);
    }
}
