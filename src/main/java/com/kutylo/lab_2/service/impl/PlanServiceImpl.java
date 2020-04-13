package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.PlanDao;
import com.kutylo.lab_2.dto.planDto.FullPlanDto;
import com.kutylo.lab_2.dto.planDto.NewPlanDto;
import com.kutylo.lab_2.dto.planDto.PlanDto;
import com.kutylo.lab_2.mappers.FullPlanMapper;
import com.kutylo.lab_2.mappers.PlanMapper;
import com.kutylo.lab_2.model.Plan;
import com.kutylo.lab_2.service.PlanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Autowired
    FullPlanMapper fullPlanMapper;

    @Autowired
    private ModelMapper mapper;


    @Override
    public PlanDto getById(int id) {

        return mapper.map(planDao.getById(id),PlanDto.class);
    }

    @Override
    public List<PlanDto> getAll() {

        return planDao.getAll()
                .stream()
                .map(p->mapper.map(p,PlanDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public NewPlanDto save(NewPlanDto planDto) {
        Plan plan=mapper.map(planDto,Plan.class);
        planDao.save(plan);

        return planDto;
    }

    @Override
    public NewPlanDto update(NewPlanDto planDto, int id) {
        Plan plan=mapper.map(planDto,Plan.class);
        plan.setId(id);
        planDao.update(plan);
        return planDto;
    }

    @Override
    public void delete(int id) {
        planDao.delete(planDao.getById(id));
    }


    @Override
    public FullPlanDto getFullPlan(int id) {
        return fullPlanMapper.convertToDto(getById(id));
    }
}
