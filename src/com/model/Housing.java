package com.model;

import javax.persistence.*;

/**
 * Created by JuAmo_000 on 17/01/2017.
 */
@Entity
public class Housing {
    public Housing() {
    }

    private String district;

    @Basic
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    private Double rentPrice;

    @Basic
    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    private String surface;

    @Basic
    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    private String address;

    @Basic
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    private Person hosts;

    @OneToOne
    public Person getHosts() {
        return hosts;
    }

    public void setHosts(Person hosts) {
        this.hosts = hosts;
    }

    private City town;

    @OneToOne
    public City getTown() {
        return town;
    }

    public void setTown(City town) {
        this.town = town;
    }

    private Type flatType;

    @Enumerated(EnumType.ORDINAL)
    public Type getFlatType() {
        return flatType;
    }

    public void setFlatType(Type flatType) {
        this.flatType = flatType;
    }
}
