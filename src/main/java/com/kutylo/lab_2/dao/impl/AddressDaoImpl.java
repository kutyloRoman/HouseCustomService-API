package com.kutylo.lab_2.dao.impl;

import com.kutylo.lab_2.dao.AddressDao;
import com.kutylo.lab_2.model.Address;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Address save(Address address) {
        entityManager.persist(address);
        return address;
    }

    @Override
    public Address getById(int id) {
        return entityManager.find(Address.class,id);
    }

    @Override
    public Address update(Address address) {
        entityManager.merge(address);
        return address;
    }

    @Override
    public void delete(Address address) {
        entityManager.remove(address);
    }

    @Override
    public List<Address> getAll() {
        return entityManager.createQuery("SELECT a FROM Address a",Address.class).getResultList();
    }
}
