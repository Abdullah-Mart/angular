package com.example.demodbrelations.entities;

import jakarta.persistence.*;

import java.util.*;

@Entity
public class Course {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String code;

    @OneToOne
    private Grade grade;

    @ManyToMany (mappedBy = "courses", fetch = FetchType.EAGER)

    private List<Student> studentList = new ArrayList<Student>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> getEnrolledStudents() {
        return studentList;
    }
}
