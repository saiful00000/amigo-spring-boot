package com.amigo.amigo.student;

import java.time.LocalDate;
import java.time.LocalTime;

public class Student {
    private long id;
    private String name;
    private String email;
    private LocalDate dob;
    private int age;

    public Student(long id, String name, String email, LocalDate dob, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    // public Student(String name, String email, LocalDate dob, Integer age) {
    //     this.name = name;
    //     this.email = email;
    //     this.dob = dob;
    //     this.age = age;
    // }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
    }


    
    
}
