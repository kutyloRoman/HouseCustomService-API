package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.planDto.FullPlanDto;
import com.kutylo.lab_2.dto.planDto.NewPlanDto;
import com.kutylo.lab_2.dto.planDto.PlanDto;
import java.util.List;

public interface PlanService {

    PlanDto getById(int id);

    List<PlanDto> getAll();

    NewPlanDto save(NewPlanDto planDto);

    NewPlanDto update(NewPlanDto planDto,int id);

    void delete(int id);

    FullPlanDto getFullPlan(int id);
}
