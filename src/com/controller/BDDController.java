package com.controller;

import com.model.District;
import com.model.Housing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * @author JuAmo_000
 * @since 17/01/2017.
 */
public class BDDController {
    private static EntityManagerFactory emf=null;
    private static EntityManager em=null;

    static {
        emf = Persistence.createEntityManagerFactory("PersistenceUnit");
        em = emf.createEntityManager();
        em.getTransaction().begin();
    }

    public static boolean commit(){
        if (em.isOpen()&&em.getTransaction().isActive()) {
            em.getTransaction().commit();
            return true;
        }
        return false;
    }

    public static void close(){
        commit();
        em.close();
    }

    public static void persist(Object o) throws IllegalArgumentException{
        if (em.isOpen()) {
            em.persist(o);
        }
        else{
            throw new IllegalArgumentException("EntityManager is not open");
        }
    }

    public static Query createQuery(String s){
        return em.createQuery(s);
    }


    public static void merge(Object o) {
        if (em.isOpen()) {
            em.merge(o);
        }
        else{
            throw new IllegalArgumentException("EntityManager is not open");
        }
    }


}