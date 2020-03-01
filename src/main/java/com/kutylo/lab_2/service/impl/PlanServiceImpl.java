package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.PlanDao;
import com.kutylo.lab_2.dto.PlanDto;
import com.kutylo.lab_2.mappers.PlanMapper;
import com.kutylo.lab_2.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Autowired
    private PlanMapper planMapper;

    @Override
    public PlanDto getById(int id) {
        return planMapper.convertToDto(planDao.getById(id));
    }

    @Override
    public List<PlanDto> getAll() {
        return null;
    }
}
