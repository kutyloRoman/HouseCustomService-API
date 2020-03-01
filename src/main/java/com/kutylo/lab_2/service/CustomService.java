package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.CustomDto;
import com.kutylo.lab_2.dto.UserDto;
import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.model.User;

import java.util.List;

public interface CustomService {
    CustomDto makeCustom(CustomDto customDto);

    CustomDto getById(int id);

    List<CustomDto> getByUserId(int id);

    List<CustomDto> getAll();
}
