package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.TeamDto;
import com.kutylo.lab_2.model.User;

public interface TeamService {
    TeamDto getById(int id);
}
