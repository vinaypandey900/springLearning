package com.example.mapping.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class StudentEntity {
    
    @Id
    private int id;
    private String name;
    private int rollNumber;
    
    @OneToOne(mappedBy = "studentEntity", cascade = CascadeType.ALL)
    private StudentIdEntity studentId;
    
    @OneToMany(mappedBy = "studentAddress", cascade = CascadeType.ALL)
    private List<Address>address=new ArrayList<>();
    
    
    public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public StudentIdEntity getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdEntity studentId) {
        this.studentId = studentId;
    }

    public StudentEntity(int id, String name, int rollNumber, StudentIdEntity studentId) {
        super();
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.studentId = studentId;
    }

    public StudentEntity() {
        super();
    }
}
