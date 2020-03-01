package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.TeamDto;
import com.kutylo.lab_2.model.User;

import java.util.List;

public interface TeamService {
    TeamDto getById(int id);

    List<TeamDto> getAll();

    TeamDto save(TeamDto teamDto);
}
