package com.example.javaApp1.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PersonInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String nationality;
    private String motherTongue;
    private String birthDate;

    public PersonInfo() {
    }

    public PersonInfo(long id, String nationality, String motherTongue, String birthDate) {
        this.id = id;
        this.nationality = nationality;
        this.motherTongue = motherTongue;
        this.birthDate = birthDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
