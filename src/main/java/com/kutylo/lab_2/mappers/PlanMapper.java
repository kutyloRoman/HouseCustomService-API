package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.converter.CustomFromIdConverter;
import com.kutylo.lab_2.converter.TeamFromIdConverter;
import com.kutylo.lab_2.converter.UserFromIdConverter;
import com.kutylo.lab_2.dto.planDto.NewPlanDto;
import com.kutylo.lab_2.model.Plan;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanMapper extends PropertyMap<NewPlanDto,Plan>{

    @Autowired
    private TeamFromIdConverter teamFromIdConverter;
    @Autowired
    private CustomFromIdConverter customFromIdConverter;

    @Override
    protected void configure() {
        using(teamFromIdConverter).map(source.getTeamId(),destination.getTeam());
        using(customFromIdConverter).map(source.getCustomId(),destination.getCustom());
    }
}
