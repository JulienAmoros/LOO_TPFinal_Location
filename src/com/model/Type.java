package com.model;

/**
 * Created by JuAmo_000 on 17/01/2017.
 */

public enum Type {
    maison(50.0), studio(15.0), T1(5.0), T2(10.0), F1(20.0), F2(25.0);
    Double flatRate;

    Type(Double flatRate){

    }
}
