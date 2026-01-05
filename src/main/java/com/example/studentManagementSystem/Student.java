package com.example.studentManagementSystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    String studentName;
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    String studentBranch;
    public String getStudentBranch(){
        return studentBranch;
    }
    public void setStudentBranch(String studentBranch){
        this.studentBranch = studentBranch;
    }
    String studentPlace;
    public String getStudentPlace(){
        return studentPlace;
    }
    public void setStudentPlace(String studentPlace){
        this.studentPlace = studentPlace;
    }

    
}
