package ua.com.alevel.service;

import ua.com.alevel.entity.AbstractEntity;

public interface BaseService <E extends AbstractEntity> {
    void create(E entity);
    void update(E entity);
    void delete(String id);
    E findById(String id);
    E[] findAll();

}
