package com.kutylo.lab_2.dao.impl;

import com.kutylo.lab_2.dao.CustomDao;
import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomDaoImpl implements CustomDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public Custom save(Custom custom) {
        entityManager.persist(custom);
        return custom;
    }

    @Transactional
    @Override
    public Custom getById(int id) {

        return entityManager.find(Custom.class,id);
    }

    @Transactional
    @Override
    public Custom update(Custom custom) {
        entityManager.merge(custom);
        return custom;
    }

    @Override
    public void delete(Custom custom) {

    }

    @Transactional
    @Override
    public List<Custom> getAll() {
        return entityManager.createQuery("SELECT c FROM Custom c", Custom.class).getResultList();
    }
}
