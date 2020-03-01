package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.AddressDao;
import com.kutylo.lab_2.dto.AddressDto;
import com.kutylo.lab_2.mappers.AddressMapper;
import com.kutylo.lab_2.model.Address;
import com.kutylo.lab_2.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private AddressDao addressDao;

    @Override
    public AddressDto save(AddressDto address) {
        Address address1=addressMapper.convertToModel(address);
        addressDao.save(address1);

        return addressMapper.convertToDto(address1);
    }

    @Override
    public Address update(Address address, int addressId) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Address getById(int id) {
        return null;
    }

    @Override
    public Address getByUserId(int id) {
        return null;
    }

    @Override
    public List<Address> getAll() {
        return null;
    }
}
