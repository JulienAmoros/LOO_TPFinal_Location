package com.controller;

import com.model.*;
import com.view.HViewDistrict;
import com.view.HViewHousing;
import com.view.HViewRegister;

/**
 * @author JuAmo_000
 * @since 17/01/2017.
 */
public class MainController {
    private Agency agency;

    public MainController(Agency agency) {
        this.agency = agency;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public void startNewHousing(){
        HViewHousing.launch(District.getDistricts());
    }

    public void startNewDistrict(){
        HViewDistrict.launch(City.getCities());
    }

    public void startRegistering(){
        HViewRegister.launch(Housing.getHousings(), Person.getAllPeople(),this);
    }

    public void setRegistering(Housing housing, Person person) {
        Agency.rent(housing,person);
    }
}
