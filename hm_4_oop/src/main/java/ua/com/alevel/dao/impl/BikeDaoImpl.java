package ua.com.alevel.dao.impl;

import ua.com.alevel.dao.BikeDao;
import ua.com.alevel.db.BikeDb;
import ua.com.alevel.entity.Bike;

public class BikeDaoImpl implements BikeDao {

    private final BikeDb bikeDB = BikeDb.getInstance();
    @Override
    public void create(Bike entity) {
        bikeDB.create(entity);
    }

    @Override
    public void update(Bike entity) {
        bikeDB.update(entity);
    }

    @Override
    public void delete(String id) {
        bikeDB.delete(id);
    }

    @Override
    public Bike findById(String id) {
        return bikeDB.findById(id);
    }

    @Override
    public Bike[] findAll() {
        return bikeDB.findAll();
    }
}
