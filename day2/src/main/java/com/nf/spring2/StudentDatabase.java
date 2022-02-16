package com.nf.spring2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class StudentDatabase {
    private final List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void createStudent(Student student) {
        students.add(student);
    }

    public Student getOneConcreteStudent(String searchValue) {
        for (Student student : students){
            if (searchValue.equals(student.getName())){
                return student;
            }
        }
        return null;
    }
}
