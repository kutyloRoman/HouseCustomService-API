package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.TeamDao;
import com.kutylo.lab_2.dto.teamDto.NewTeamDto;
import com.kutylo.lab_2.dto.teamDto.TeamDto;
import com.kutylo.lab_2.model.Team;
import com.kutylo.lab_2.service.TeamService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public TeamDto getById(int id) {

        return modelMapper.map(teamDao.getById(id),TeamDto.class);
    }

    @Override
    public List<TeamDto> getAll() {
        return teamDao.getAll()
                .stream()
                .map(t->modelMapper.map(t,TeamDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public TeamDto save(NewTeamDto newTeamDto) {
        Team team=modelMapper.map(newTeamDto,Team.class);
        teamDao.save(team);

        return modelMapper.map(team,TeamDto.class);
    }

    @Override
    public TeamDto update(TeamDto teamDto) {
        Team team=modelMapper.map(teamDto,Team.class);
        teamDao.update(team);

        return modelMapper.map(team,TeamDto.class);
    }

    @Override
    public void delete(int id) {
        teamDao.delete(teamDao.getById(id));
    }
}
