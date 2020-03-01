package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.CustomDto;
import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class CustomMapper implements Mapper<Custom, CustomDto> {

    @Autowired
    private UserService userService;

    @Override
    public Custom convertToModel(CustomDto customDto) {
        Custom custom=new Custom();
        custom.setStatus(customDto.getStatus());
        custom.setTime(customDto.getTime());
        custom.setKindOfWork(customDto.getKindOfWork());
        custom.setScope(customDto.getScope());
        custom.setUser(userService.getById(customDto.getUserId()));

        return custom;
    }

    @Override
    public CustomDto convertToDto(Custom custom) {
        CustomDto customDto = new CustomDto();
        customDto.setKindOfWork(custom.getKindOfWork());
        customDto.setScope(custom.getScope());
        customDto.setTime(custom.getTime());
        customDto.setStatus(custom.getStatus());
        customDto.setUserId(custom.getUser().getId());

        return customDto;
    }
}
