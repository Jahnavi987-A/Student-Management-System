package com.example.studentManagementSystem;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.*;
// import org.springframework.web.bind.annotation.RequestParam;




@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @GetMapping("/allstudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
    @PatchMapping("/update/{id}")
    public Student updateDetails(@PathVariable int id,@RequestBody Student student){
        return studentService.updateStudent(id,student);
    }
    @PutMapping("/allupdate/{id}")
    public Student updateAllDetails(@PathVariable int id,@RequestBody Student student){
        return studentService.updateAllDetails(id,student);
    }
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id).orElseThrow(()-> new RuntimeException("Student not found"));
    }
    
}
