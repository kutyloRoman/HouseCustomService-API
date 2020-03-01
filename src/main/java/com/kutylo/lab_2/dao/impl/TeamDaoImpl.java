package com.kutylo.lab_2.dao.impl;

import com.kutylo.lab_2.dao.TeamDao;
import com.kutylo.lab_2.model.Team;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class TeamDaoImpl implements TeamDao {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    @Override
    public Team save(Team team) {
        entityManager.persist(team);
        return team;
    }

    @Transactional
    @Override
    public Team getById(int id) {
        return entityManager.find(Team.class,id);
    }

    @Transactional
    @Override
    public Team update(Team team) {
        entityManager.merge(team);
        return team;
    }

    @Transactional
    @Override
    public void delete(Team team) {
        entityManager.remove(team);
    }

    @Transactional
    @Override
    public List<Team> getAll() {
       return entityManager.createQuery("SELECT t FROM Team t",Team.class).getResultList();
    }
}
