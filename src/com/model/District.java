package com.model;

import javax.persistence.*;

/**
 * Created by JuAmo_000 on 18/01/2017.
 */
@Entity
public class District {
    // Constructors
    public District() {
    }

    public District(String district, City town) {
        this.district = district;
        this.town = town;
    }

    // Attributes
    @Basic
    private String district;
    @OneToOne(cascade = {CascadeType.ALL})
    private City town;
    @GeneratedValue
    @Id
    private Integer id;

    // Accessors
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }


    public City getTown() {
        return town;
    }
    public void setTown(City town) {
        this.town = town;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
