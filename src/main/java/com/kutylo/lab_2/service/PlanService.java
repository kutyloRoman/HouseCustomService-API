package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.PlanDto;
import com.kutylo.lab_2.dto.UserDto;
import com.kutylo.lab_2.model.User;

import java.util.List;

public interface PlanService {

    PlanDto getById(int id);

    List<PlanDto> getAll();
}
