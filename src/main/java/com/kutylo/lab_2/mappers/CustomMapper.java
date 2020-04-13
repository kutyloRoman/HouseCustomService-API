package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.customDto.NewCustomDto;
import com.kutylo.lab_2.model.Custom;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class CustomMapper extends PropertyMap<NewCustomDto, Custom> {

    @Override
    protected void configure()
    {
        map().setStatus("REGISTER");
    }


}
