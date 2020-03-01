package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.PlanDao;
import com.kutylo.lab_2.dto.FullPlanDto;
import com.kutylo.lab_2.dto.PlanDto;
import com.kutylo.lab_2.mappers.FullPlanMapper;
import com.kutylo.lab_2.mappers.PlanMapper;
import com.kutylo.lab_2.model.Plan;
import com.kutylo.lab_2.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Autowired
    private PlanMapper planMapper;

    @Autowired
    FullPlanMapper fullPlanMapper;

    @Override
    public PlanDto getById(int id) {
        return planMapper.convertToDto(planDao.getById(id));
    }

    @Override
    public List<PlanDto> getAll() {

        return planDao.getAll()
                .stream()
                .map(p->planMapper.convertToDto(p))
                .collect(Collectors.toList());
    }

    @Override
    public PlanDto save(PlanDto planDto) {
        Plan plan=planMapper.convertToModel(planDto);
        planDao.save(plan);

        return planDto;
    }



    @Override
    public FullPlanDto getFullPlan(int id) {
        return fullPlanMapper.convertToDto(getById(id));
    }
}
