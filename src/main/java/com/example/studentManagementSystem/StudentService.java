package com.example.studentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public void deleteStudent(int id){
        Student student = getStudentById(id).orElseThrow(()->new RuntimeException("Student not found"));
        studentRepository.delete(student);
    }
    public Optional<Student> getStudentById(int id){
        return studentRepository.findById(id);
    }
    public Student updateStudent(int id,Student student){
        Student existingStudent = studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
        if(student.getStudentName()!=null){
            existingStudent.setStudentName(student.getStudentName());
        }
        if(student.getStudentBranch()!=null){
            existingStudent.setStudentBranch(student.getStudentBranch());
        }
        if(student.getStudentPlace()!=null){
            existingStudent.setStudentPlace(student.getStudentPlace());
        }

        return studentRepository.save(existingStudent);
         
    }
    public Student updateAllDetails(int id,Student student){
        Student existingStudent = studentRepository.findById(id).orElseThrow(()->new RuntimeException("Student not found"));
        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setStudentBranch(student.getStudentBranch());
        existingStudent.setStudentPlace(student.getStudentPlace());

        return studentRepository.save(existingStudent);
    }
}
