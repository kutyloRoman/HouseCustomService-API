package com.kutylo.lab_2.converter;

import com.kutylo.lab_2.dao.TeamDao;
import com.kutylo.lab_2.dao.UserDao;
import com.kutylo.lab_2.dto.teamDto.TeamDto;
import com.kutylo.lab_2.model.Team;
import com.kutylo.lab_2.model.User;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamFromIdConverter implements Converter<Integer, Team> {

    @Autowired
    private TeamDao teamDao;

    @Override
    public Team convert(MappingContext<Integer, Team> mappingContext) {
        if (mappingContext.getSource() != null) {
            return teamDao.getById(mappingContext.getSource());
        }
        return null;
    }
}
