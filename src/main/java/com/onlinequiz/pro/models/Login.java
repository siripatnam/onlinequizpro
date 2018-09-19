package com.onlinequiz.pro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "register")
public class Login {
    @Id
    @Column(name = "id")
    int studentId;

    @Column(name = "password")
    String password;


    public Login() {

    }

    public Login(int studentId, String password) {
        this.studentId = studentId;
        this.password = password;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}