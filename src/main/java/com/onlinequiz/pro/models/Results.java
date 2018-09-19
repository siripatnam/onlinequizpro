package com.onlinequiz.pro.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Results {
    @Id
    @GeneratedValue
    @Column(name = "resultid")
    private int resultid;
    @Column(name = "studentid")
    private int studentid;

    @Column(name = "score")
    private int score;

    public Results() {
    }

    public Results(int resultid, int studentid, int score) {
        this.resultid = resultid;
        this.studentid = studentid;
        this.score = score;
    }

    public int getResultid() {
        return resultid;
    }

    public void setResultid(int resultid) {
        this.resultid = resultid;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }




    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
