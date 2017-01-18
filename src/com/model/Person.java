package com.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by JuAmo_000 on 17/01/2017.
 */
@Entity
public class Person {
    // Constructors
    public Person() {
    }

    public Person(String firstName, String lastName, Date birthDate, String numTel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.numTel = numTel;
    }

    // Attributes
    @Basic
    private String firstName;
    @Basic
    private String lastName;
    @Basic
    private Date birthDate;
    @Basic
    private String numTel;
    @GeneratedValue
    @Id
    private Integer id;

    // Accessors
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date dateOfBirth) {
        this.birthDate = dateOfBirth;
    }


    public String getNumTel() {
        return numTel;
    }
    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
