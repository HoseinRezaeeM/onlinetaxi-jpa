package ir.onlineTaxi.jpa.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityMangerFactoryProvider {
    private final static EntityManagerFactory entityManagerFactory;

    static{
        entityManagerFactory = Persistence.createEntityManagerFactory("default");

    }
    public static EntityManagerFactory getEntityManagerFactory(){
        return entityManagerFactory;
    }
}
