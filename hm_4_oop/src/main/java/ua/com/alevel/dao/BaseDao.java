package ua.com.alevel.dao;

import ua.com.alevel.entity.AbstractEntity;

import java.util.Collection;
import java.util.Optional;

public interface BaseDao <E extends AbstractEntity> {
    void create(E entity);
    void update(E entity);
    void delete(String id);
    E findById(String id);
    E[] findAll();
}
