package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.customDto.CustomDto;
import com.kutylo.lab_2.dto.customDto.NewCustomDto;

import java.util.List;

public interface CustomService {
    CustomDto makeCustom(NewCustomDto customDto);

    CustomDto update(NewCustomDto customDto,int id);

    void delete(int id);

    CustomDto getById(int id);

    List<CustomDto> getByUserId(int id);

    List<CustomDto> getAll();
}
