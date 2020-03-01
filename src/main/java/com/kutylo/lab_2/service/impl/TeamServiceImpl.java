package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.TeamDao;
import com.kutylo.lab_2.dto.TeamDto;
import com.kutylo.lab_2.mappers.TeamMapper;
import com.kutylo.lab_2.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
