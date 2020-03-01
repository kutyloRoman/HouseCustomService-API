package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.CustomDao;
import com.kutylo.lab_2.dto.CustomDto;
import com.kutylo.lab_2.mappers.CustomMapper;
import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    private CustomDao customDao;
    @Autowired
    private CustomMapper customMapper;

    @Override
    public CustomDto makeCustom(CustomDto customDto) {
        Custom custom=customMapper.convertToModel(customDto);
        customDao.save(custom);

        return customDto;
    }

    @Override
    public CustomDto getById(int id) {
        return customMapper.convertToDto(customDao.getById(id));
    }

    @Override
    public List<CustomDto> getByUserId(int id) {
        return  customDao.getAll()
                .stream()
                .filter(c->c.getUser().getId()==id)
                .map(c->customMapper.convertToDto(c))
                .collect(Collectors.toList());
    }


    @Override
    public List<CustomDto> getAll() {
        return customDao.getAll()
                .stream()
                .map(c->customMapper.convertToDto(c))
                .collect(Collectors.toList());
    }
}
