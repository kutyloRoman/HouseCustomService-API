package com.kutylo.lab_2.dao.impl;

import com.kutylo.lab_2.dao.PlanDao;
import com.kutylo.lab_2.model.Plan;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PlanDaoImpl implements PlanDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public Plan save(Plan plan) {
        entityManager.persist(plan);
        return plan;
    }

    @Transactional
    @Override
    public Plan getById(int id) {
        return entityManager.find(Plan.class,id);
    }

    @Transactional
    @Override
    public Plan update(Plan plan) {
        entityManager.merge(plan);
        return plan;
    }

    @Transactional
    @Override
    public void delete(Plan plan) {
        entityManager.remove(plan);
    }

    @Transactional
    @Override
    public List<Plan> getAll() {
        return entityManager.createQuery("SELECT p FROM Plan p",Plan.class).getResultList();
    }
}
