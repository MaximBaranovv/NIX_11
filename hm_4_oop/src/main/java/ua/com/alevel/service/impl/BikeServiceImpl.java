package ua.com.alevel.service.impl;

import ua.com.alevel.dao.BikeDao;
import ua.com.alevel.dao.impl.BikeDaoImpl;
import ua.com.alevel.entity.Bike;
import ua.com.alevel.service.BikeService;

public class BikeServiceImpl implements BikeService {
    BikeDao bikeDao= new BikeDaoImpl();

    @Override
    public void create(Bike entity) {
        bikeDao.create(entity);
    }

    @Override
    public void update(Bike entity) {
        bikeDao.update(entity);
    }

    @Override
    public void delete(String id) {
        bikeDao.delete(id);
    }

    @Override
    public Bike findById(String id) {
        return bikeDao.findById(id);
    }
    @Override
    public Bike[] findAll() {
        return bikeDao.findAll();
    }
}
