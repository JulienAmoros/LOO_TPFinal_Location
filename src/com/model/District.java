package com.model;

import com.controller.BDDController;

import javax.persistence.*;
import java.util.List;

/**
 * @author JuAmo_000
 * @since 18/01/2017.
 */
@Entity
public class District {
    // Constructors
    public District() {
    }

    public District(String name, City town) {
        this.name = name;
        this.town = town;
    }

    // Attributes
    @Basic
    private String name;
    @OneToOne(cascade = {CascadeType.ALL})
    private City town;
    @GeneratedValue
    @Id
    private Integer id;

    // Accessors
    public String getName() {
        return name;
    }
    public void setName(String district) {
        this.name = district;
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

    public static List<District> getDistricts(){
        return BDDController.createQuery("select name from District district").getResultList();
    }

    @Override
    public String toString() {
        return name + " - "+town;
    }
}
