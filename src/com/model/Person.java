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

    private String firstName;

    @Basic
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String lastName;

    @Basic
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private Date birthDate;

    @Basic
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date dateOfBirth) {
        this.birthDate = dateOfBirth;
    }

    private String numTel;

    @Basic
    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    private Integer id;

    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
