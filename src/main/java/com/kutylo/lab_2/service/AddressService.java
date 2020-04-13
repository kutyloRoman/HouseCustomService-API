package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.addressDto.AddressDto;

import java.util.List;

public interface AddressService {

    AddressDto getById(int id);

    List<AddressDto> getAll();
}
