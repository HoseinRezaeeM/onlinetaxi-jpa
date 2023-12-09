package ir.onlineTaxi.jpa.util;

import ir.onlineTaxi.jpa.repository.DriverRepository;
import ir.onlineTaxi.jpa.repository.PassengerRepository;
import ir.onlineTaxi.jpa.repository.TripRepository;
import ir.onlineTaxi.jpa.repository.impl.DriverRpositoryImpl;
import ir.onlineTaxi.jpa.repository.impl.PassengerRepositoryImpl;
import ir.onlineTaxi.jpa.repository.impl.TripRepositoryImpl;
import ir.onlineTaxi.jpa.service.DriverService;
import ir.onlineTaxi.jpa.service.PassengerService;
import ir.onlineTaxi.jpa.service.TripService;
import ir.onlineTaxi.jpa.service.impl.DriverServiceImpl;
import ir.onlineTaxi.jpa.service.impl.PassengerServiceImpl;
import ir.onlineTaxi.jpa.service.impl.TripServiceImpl;

import javax.persistence.EntityManager;

public class ApplicationContex {
    private static final EntityManager entityManger;
    private static final PassengerRepository passengerRepository;
    private static final PassengerService passengerService;
    private static final TripRepository tripRepository;
    private static final TripService tripService;
    private static final DriverRepository driverRepository;
    private static final DriverService driverService;

    static {
        entityManger = EntityMangerFactoryProvider.getEntityManagerFactory().createEntityManager();
        passengerRepository = new PassengerRepositoryImpl(entityManger);
        passengerService = new PassengerServiceImpl(passengerRepository);
        tripRepository = new TripRepositoryImpl(entityManger);
        tripService = new TripServiceImpl(tripRepository);
        driverRepository = new DriverRpositoryImpl(entityManger);
        driverService = new DriverServiceImpl(driverRepository);
    }

    public static PassengerService getPassengerServiceImpl() {
        return passengerService;
    }

    public static TripService getTripServiceImpl() {
        return tripService;
    }

    public static DriverService getDriverServiceImpl() {
        return driverService;
    }

}
