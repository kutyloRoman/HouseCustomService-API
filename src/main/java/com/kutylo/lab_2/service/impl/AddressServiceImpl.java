package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.AddressDao;
import com.kutylo.lab_2.dto.addressDto.AddressDto;
import com.kutylo.lab_2.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public AddressDto getById(int id) {
        return modelMapper.map(addressDao.getById(id),AddressDto.class);
    }


    @Override
    public List<AddressDto> getAll() {
        return addressDao.getAll().stream()
                .map(a->modelMapper.map(a,AddressDto.class))
                .collect(Collectors.toList());
    }
}
