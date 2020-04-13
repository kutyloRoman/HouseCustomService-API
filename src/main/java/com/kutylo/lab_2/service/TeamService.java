package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.teamDto.NewTeamDto;
import com.kutylo.lab_2.dto.teamDto.TeamDto;
import java.util.List;

public interface TeamService {
    TeamDto getById(int id);

    List<TeamDto> getAll();

    TeamDto save(NewTeamDto newTeamDto);

    TeamDto update(TeamDto teamDto);

    void delete(int id);
}
