package com.nf.spring2;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentDatabase studentDatabase;

    public StudentService(StudentDatabase studentDatabase) {
        this.studentDatabase = studentDatabase;
    }

    public List<Student> getStudents() {
        return studentDatabase.getStudents();
    }

    public void createStudent(Student student) {
        studentDatabase.createStudent(student);
    }

    public Student getSpezialStudent(String searchValue) {
        for (Student student : studentDatabase.getStudents()){
            if (student.getName().equals(searchValue)){
                return student;
            }
        }
        return null;
    }
}
