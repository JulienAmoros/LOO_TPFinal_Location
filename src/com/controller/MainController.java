package com.controller;

import com.model.*;
import com.view.*;

/**
 * @author JuAmo_000
 * @since 17/01/2017.
 */
public class MainController {


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

    public void startChecking(){
        HViewCheck.launch(City.getCities(), this);
    }

    public void checkAvailable(City city){
        HViewResult.launch(Housing.getAvailable(city));
    }

    public void checkOccupied(City city) {HViewResult.launch(Housing.getOccupied(city));}
}
