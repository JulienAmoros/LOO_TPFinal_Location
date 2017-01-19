package com.model;

import com.controller.BDDController;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * @author JuAmo_000
 * @since 17/01/2017.
 */
@Entity
public class City {
    // Constructors
    public City() {
    }

    public City(String name, int numPeople, double agencyDistance) {
        this.name = name;
        this.numPeople = numPeople;
        this.agencyDistance = agencyDistance;
    }

    // Attributes
    @Basic
    private int numPeople;
    @Basic
    private double agencyDistance;
    @Id
    private String name;

    // Accessors
    public int getNumPeople() {
        return numPeople;
    }
    public void setNumPeople(Integer inhabitants) {
        this.numPeople = inhabitants;
    }

    public double getAgencyDistance() {
        return agencyDistance;
    }
    public void setAgencyDistance(Double agencyDistance) {
        this.agencyDistance = agencyDistance;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static List<City> getCities(){
        return BDDController.createQuery("select city from City city").getResultList();
    }

    @Override
    public String toString() {
        return name;
    }
}
