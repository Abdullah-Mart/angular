package com.example.demodbrelations.entities;

import jakarta.persistence.*;

@Entity
public class Grade {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private int score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }




    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne

    private Student student;

    @OneToOne
    private  Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


}
