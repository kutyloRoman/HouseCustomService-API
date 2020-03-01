package com.kutylo.lab_2.dao.impl;

import com.kutylo.lab_2.dao.UserDao;
import com.kutylo.lab_2.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public User save(User user) {
        entityManager.persist(user);
        return user;
    }

    @Transactional
    @Override
    public User getById(int id) {
        return entityManager.find(User.class,id);
    }

    @Transactional
    @Override
    public User update(User user) {
       entityManager.merge(user);
       return user;
    }

    @Transactional
    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Transactional
    @Override
    public List<User> getAll() {
        return entityManager.createQuery("SELECT u FROM User u",User.class).getResultList();
    }
}
