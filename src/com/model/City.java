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

    public City(String nom, Integer inhabitants, Double agencyDistance) {
        this.name = nom;
        this.inhabitants = inhabitants;
        this.agencyDistance = agencyDistance;
    }

    // Attributes
    @Basic
    private Integer inhabitants;
    @Basic
    private Double agencyDistance;
    @Id
    private String name;

    // Accessors
    public Integer getInhabitants() {
        return inhabitants;
    }
    public void setInhabitants(Integer inhabitants) {
        this.inhabitants = inhabitants;
    }

    public Double getAgencyDistance() {
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
