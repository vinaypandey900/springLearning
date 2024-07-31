package com.example.mapping.entity;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT_ID")
public class StudentIdEntity {

    @Id
    @Column(name="id")
    private int studentId;
    
    
    @OneToOne
    @JoinColumn(name="student_id")
    private StudentEntity studentEntity;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public StudentIdEntity(int studentId, StudentEntity studentEntity) {
        super();
        this.studentId = studentId;
        this.studentEntity = studentEntity;
    }

    public StudentIdEntity() {
        super();
    }
}
