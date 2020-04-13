package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.customDto.CustomDto;
import com.kutylo.lab_2.dto.planDto.FullPlanDto;
import com.kutylo.lab_2.dto.planDto.PlanDto;
import com.kutylo.lab_2.service.CustomService;
import com.kutylo.lab_2.service.TeamService;
import com.kutylo.lab_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FullPlanMapper implements Mapper<PlanDto, FullPlanDto> {

    @Autowired
    TeamService teamService;
    @Autowired
    CustomService customService;
    @Autowired
    UserService userService;

    @Override
    public PlanDto convertToModel(FullPlanDto fullPlanDto) {
       return null;
    }

    @Override
    public FullPlanDto convertToDto(PlanDto planDto) {
        FullPlanDto fullPlanDto=new FullPlanDto();
        CustomDto customDto=customService.getById(planDto.getCustomId());
        fullPlanDto.setCustom(customDto);
        fullPlanDto.setTeam(teamService.getById(planDto.getTeamId()));
        fullPlanDto.setUserDto(userService.getById(customDto.getUserId()));
        fullPlanDto.setDate(planDto.getDate());
        fullPlanDto.setPrice(planDto.getPrice());

        return fullPlanDto;
    }
}
