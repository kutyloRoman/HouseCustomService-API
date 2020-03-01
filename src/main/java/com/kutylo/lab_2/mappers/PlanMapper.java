package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.PlanDto;
import com.kutylo.lab_2.model.Plan;
import com.kutylo.lab_2.service.CustomService;
import com.kutylo.lab_2.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanMapper implements Mapper<Plan, PlanDto> {

    @Autowired
    CustomService customService;

    @Autowired
    CustomMapper customMapper;

    @Autowired
    TeamMapper teamMapper;

    @Autowired
    TeamService teamService;



    @Override
    public Plan convertToModel(PlanDto planDto) {
        Plan plan=new Plan();
        plan.setDate(planDto.getDate());
        plan.setPrice(planDto.getPrice());
        plan.setCustom(customMapper.convertToModel(customService.getById(planDto.getCustomId())));
        plan.setTeam(teamMapper.convertToModel(teamService.getById(planDto.getTeamId())));

        return plan;
    }

    @Override
    public PlanDto convertToDto(Plan plan) {
        PlanDto planDto=new PlanDto();
        planDto.setDate(plan.getDate());
        planDto.setPrice(plan.getPrice());
        planDto.setCustomId(plan.getCustom().getId());
        planDto.setTeamId(plan.getTeam().getId());

        return planDto;
    }
}
