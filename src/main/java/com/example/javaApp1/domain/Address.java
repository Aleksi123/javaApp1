package com.example.javaApp1.domain;

import javax.persistence.*;
import com.example.javaApp1.domain.Person;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String country;
    private String streetAddress;
    private String city;
    private String postalCode;
    @OneToMany(mappedBy = "address")
    private List<Person> person;

    public Address() {
    }

    public Address(long id, String country, String streetAddress, String city, String postalCode, List<Person> person) {
        this.id = id;
        this.country = country;
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.person = person;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }



}
