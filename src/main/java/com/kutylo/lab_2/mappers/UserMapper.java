package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.userDto.NewUserDto;
import com.kutylo.lab_2.model.User;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends PropertyMap<NewUserDto,User>{
    @Override
    protected void configure() {
        map(null, destination.getAddress().getUser());
    }


}
