package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.AddressDto;
import com.kutylo.lab_2.model.Address;

import java.util.List;

public interface AddressService {
    AddressDto save(AddressDto address);

    Address update(Address address, int addressId);

    void delete(int id);

    Address getById(int id);

    Address getByUserId(int id);

    List<Address> getAll();
}
