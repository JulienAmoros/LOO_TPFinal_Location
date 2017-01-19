package com.controller;

import com.model.Agency;
import com.model.City;
import com.model.District;
import com.view.HViewHousing;

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
        HViewHousing.launch(District.getDistricts(), City.getCities());
    }
}
