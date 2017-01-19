package com.model;

import com.controller.BDDController;

import javax.persistence.*;
import java.util.*;

/**
 * Created by JuAmo_000 on 17/01/2017.
 */
public class Agency {

    public static List<Housing> getEmptyHousing(){
        return BDDController.createQuery("from Housing where hosts = null").getResultList();
    }

    public static List<Housing> getOccupiedHousing(){
        return BDDController.createQuery("from Housing where hosts != null").getResultList();
    }

    public static List<Housing> getAllHousing(){
        return BDDController.createQuery("from Housing").getResultList();
    }

    public static List<Person> getPerson(){
        return BDDController.createQuery("from Person").getResultList();
    }

    public static List<District> getDistrict(){
        return BDDController.createQuery("from District").getResultList();
    }

    public static List<City> getTown(){
        return BDDController.createQuery("from City").getResultList();
    }

    public static List filterHousByDistrict(List<Housing> list, District dist){
        if(list == null)
            list = getAllHousing();
        List res = new ArrayList();
        for(Housing hous : list){
            if(hous.getDistrict() == dist)
                res.add(hous);
        }
        return res;
    }

    public static List filterHousByTown(List<Housing> list, City city){
        if(list == null)
            list = getAllHousing();
        List res = new ArrayList();
        for(Housing hous : list){
            if(hous.getDistrict().getTown() == city)
                res.add(hous);
        }
        return res;
    }

    public static List filterHousByType(List<Housing> list, Type type){
        if(list == null)
            list = getAllHousing();
        List res = new ArrayList();
        for(Housing hous : list){
            if(hous.getFlatType() == type)
                res.add(hous);
        }
        return res;
    }

    public static void rent(Housing hou, Person per){
        hou.rent(per);
    }

    public static void printFlatList(List<Housing> list){
        Iterator i = list.iterator();
        while(i.hasNext()){
            Housing hou = (Housing) i.next();
            System.out.print(hou.getFlatType() + " of " +
                    hou.getSurface() + "m² in " +
                    hou.getAddress() + " " +
                    hou.getDistrict().getDistrict() + " " +
                    hou.getDistrict().getTown().getName() + " for " +
                    hou.getRentPrice() + "€ "
            );
            if(hou.getHosts() != null){
                Person per = hou.getHosts();
                System.out.println("occupied by " + per.getFirstName() + " " + per.getLastName());
            }
            else
                System.out.println("EMPTY");
        }
    }

    public static void registerPerson(String firstName, String lastName, java.sql.Date birthDate, String numTel){
        Person pers = new Person(firstName, lastName, birthDate, numTel);
        BDDController.persist(pers);
    }

    public static void registerDistrict(String name, City town){
        District dist = new District(name, town);
        BDDController.persist(dist);
    }

    public static void registerCity(String name, Integer population, Double agencyDistance){
        City town = new City(name, population, agencyDistance);
        BDDController.persist(town);
    }

    public static void registerHousing(District dist, Double rentPrice, Double surface, String address, Person hosts, Type type){
        Housing hous = new Housing(dist, rentPrice, surface, address, hosts, type);
        BDDController.persist(hous);
    }
}
