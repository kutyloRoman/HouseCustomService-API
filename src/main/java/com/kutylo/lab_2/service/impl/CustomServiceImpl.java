package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.CustomDao;
import com.kutylo.lab_2.dto.customDto.CustomDto;
import com.kutylo.lab_2.dto.customDto.NewCustomDto;
import com.kutylo.lab_2.mappers.CustomMapper;
import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.service.CustomService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomServiceImpl implements CustomService {

    @Autowired
    private CustomDao customDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CustomDto makeCustom(NewCustomDto customDto) {
        Custom custom=modelMapper.map(customDto,Custom.class);
        customDao.save(custom);
        return modelMapper.map(custom,CustomDto.class);
    }

    @Override
    public CustomDto update(NewCustomDto customDto,int id) {
        Custom custom=modelMapper.map(customDto,Custom.class);
        custom.setId(id);
        customDao.update(custom);
        return modelMapper.map(custom,CustomDto.class);
    }

    @Override
    public void delete(int id) {
        customDao.delete(customDao.getById(id));
    }

    @Override
    public CustomDto getById(int id) {
        return modelMapper.map(customDao.getById(id),CustomDto.class);
    }

    @Override
    public List<CustomDto> getByUserId(int id) {
        return  customDao.getAll()
                .stream()
                .filter(c->c.getUser().getId()==id)
                .map(c->modelMapper.map(c,CustomDto.class))
                .collect(Collectors.toList());
    }


    @Override
    public List<CustomDto> getAll() {
        return customDao.getAll()
                .stream()
                .map(c->modelMapper.map(c,CustomDto.class))
                .collect(Collectors.toList());
    }
}
