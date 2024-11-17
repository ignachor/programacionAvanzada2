package com.mycompany.maintienda;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    private static final EntityManagerFactory entityManagerFactory = 
        Persistence.createEntityManagerFactory("mi_unidad_de_persistencia");

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }
}
