package com.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by JuAmo_000 on 17/01/2017.
 */
@Entity
public class City {
    private Integer inhabitants;

    @Basic
    public Integer getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(Integer inhabitants) {
        this.inhabitants = inhabitants;
    }

    private Double agencyDistance;

    @Basic
    public Double getAgencyDistance() {
        return agencyDistance;
    }

    public void setAgencyDistance(Double agencyDistance) {
        this.agencyDistance = agencyDistance;
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
