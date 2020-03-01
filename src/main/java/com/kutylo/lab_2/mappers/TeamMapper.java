package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.TeamDto;
import com.kutylo.lab_2.model.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper implements Mapper<Team, TeamDto> {
    @Override
    public Team convertToModel(TeamDto teamDto) {
        Team team=new Team();
        team.setAmount(teamDto.getAmount());

        return team;
    }

    @Override
    public TeamDto convertToDto(Team team) {
        TeamDto teamDto=new TeamDto();
        teamDto.setAmount(team.getAmount());
        return teamDto;
    }
}
