package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.TeamDao;
import com.kutylo.lab_2.dto.TeamDto;
import com.kutylo.lab_2.mappers.TeamMapper;
import com.kutylo.lab_2.model.Team;
import com.kutylo.lab_2.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamDao teamDao;

    @Autowired
    TeamMapper teamMapper;

    @Override
    public TeamDto getById(int id) {
        return teamMapper.convertToDto(teamDao.getById(id));
    }

    @Override
    public List<TeamDto> getAll() {
        return teamDao.getAll()
                .stream()
                .map(t->teamMapper.convertToDto(t))
                .collect(Collectors.toList());
    }

    @Override
    public TeamDto save(TeamDto teamDto) {
        Team team=teamMapper.convertToModel(teamDto);
        teamDao.save(team);

        return teamDto;
    }
}
