package com.model;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import javax.persistence.*;
import java.util.*;

/**
 * Created by JuAmo_000 on 17/01/2017.
 */
public class Agency {
    static EntityManager em;

    public static void closeAgency(){
        em.getTransaction().commit();
        em.close();
    }

    public static EntityManager getEM(){
        if(em == null){
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit");
            em = emf.createEntityManager();
            em.getTransaction().begin();
        }
        return em;
    }

    public static List getEmptyHousing(){
        return getEM().createQuery("from Housing where hosts = null").getResultList();
    }

    public static List getAllHousing(){
        return getEM().createQuery("from Housing").getResultList();
    }

    public static List filterByDistrict(List<Housing> list, District dist){
        if(list == null)
            list = getAllHousing();
        List res = new ArrayList();
        for(Housing hous : list){
            if(hous.getDistrict() == dist)
                res.add(hous);
        }
        return res;
    }

    public static List filterByTown(List<Housing> list, City city){
        if(list == null)
            list = getAllHousing();
        List res = new ArrayList();
        for(Housing hous : list){
            if(hous.getDistrict().getTown() == city)
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
            System.out.println(hou.getFlatType() + " of " +
                    hou.getSurface() + "m² in " +
                    hou.getAddress() + " " +
                    hou.getDistrict().getDistrict() + " " +
                    hou.getDistrict().getTown().getName() + " for " +
                    hou.getRentPrice() + "€ "
            );
        }
    }
}
