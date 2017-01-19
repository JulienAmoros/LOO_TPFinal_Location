package com.model;

public enum Type {
    maison(50.0), studio(15.0), T1(5.0), T2(10.0), F1(20.0), F2(25.0);
    /**
     * @author JuAmo_000
     * @since 17/01/2017.
     */
    Double flatRate;

    Type(Double flatRate){
        this.flatRate = flatRate;
    }
}
