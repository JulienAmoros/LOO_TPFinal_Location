package com.model;

import javax.persistence.*;

/**
 * @author JuAmo_000
 * @since 17/01/2017.
 */
@Entity
public class Housing {
    // Constructors
    public Housing() {
    }

    public Housing(District district, Double rentPrice, Double surface, String address, Person hosts, Type flatType) {
        this.district = district;
        this.rentPrice = rentPrice;
        this.surface = surface;
        this.address = address;
        this.hosts = hosts;
        this.flatType = flatType;
    }

    //Attributes
    @OneToOne(cascade = {CascadeType.ALL})
    private District district;
    @Basic
    private Double rentPrice;
    @Basic
    private Double surface;
    @Basic
    private String address;
    @GeneratedValue
    @Id
    private Integer id;
    @OneToOne(cascade = {CascadeType.ALL})
    private Person hosts;
    @Enumerated(EnumType.ORDINAL)
    private Type flatType;

    // Accessors
    public District getDistrict() {
        return district;
    }
    public void setDistrict(District district) {
        this.district = district;
    }


    public Double getRentPrice() {
        return rentPrice;
    }
    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }


    public Double getSurface() {
        return surface;
    }
    public void setSurface(Double surface) {
        this.surface = surface;
    }


    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }


    public Person getHosts() {
        return hosts;
    }
    public void setHosts(Person hosts) {
        this.hosts = hosts;
    }


    public Type getFlatType() {
        return flatType;
    }
    public void setFlatType(Type flatType) {
        this.flatType = flatType;
    }

    // Methods
    public void rent(Person pers){
        this.hosts = pers;
    }
}
