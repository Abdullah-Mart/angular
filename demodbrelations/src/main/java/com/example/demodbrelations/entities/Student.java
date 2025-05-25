package com.example.demodbrelations.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String studentCode;




    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    @ManyToMany
    @JoinTable(
            name = "student.course",
            joinColumns = @JoinColumn(name ="student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses = new ArrayList<>();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @OneToOne
    private Address address;

    @OneToMany(mappedBy = "student", cascade = CascadeType.MERGE,
    orphanRemoval = true, fetch = FetchType.EAGER)

    public List<Grade> grades = new ArrayList<Grade>();

    public List<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}
