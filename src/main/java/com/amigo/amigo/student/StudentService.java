package com.amigo.amigo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.repository = studentRepository;
    }

    public List<Student> getStudents() {
        return  repository.findAll();
    }

    public void registerNewStudents(Student student){

        Optional<Student> optionalStudent = repository.getStudentByEmail(student.getEmail());
        if(optionalStudent.isPresent()){
            throw new IllegalStateException("Email already taken.");
        }

        repository.save(student);
    }

    public void deleteStudent(Long studentId){
        boolean exist = repository.existsById(studentId);
        if(!exist){
            throw new IllegalStateException("No student found.");
        }

        repository.deleteById(studentId);
    }
}
