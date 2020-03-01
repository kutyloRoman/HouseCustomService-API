package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.CustomDao;
import com.kutylo.lab_2.dto.CustomDto;
import com.kutylo.lab_2.mappers.CustomMapper;
import com.kutylo.lab_2.model.Custom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    @Autowired
    private CustomDao customDao;

    @Autowired
    private CustomMapper customMapper;

    public CustomDto setStatus(int id, String status){
        Custom custom=customDao.getById(id);
        custom.setStatus(status);
        customDao.update(custom);
        return customMapper.convertToDto(custom);
    }
}
