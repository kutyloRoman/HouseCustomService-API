package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dto.userDto.NewUserDto;
import com.kutylo.lab_2.dto.userDto.UserDto;
import java.util.List;

public interface UserService {
    UserDto save(NewUserDto user);

    UserDto update(NewUserDto user, int id);

    void delete(int id);

    UserDto getById(int id);

    UserDto getByAddressId(int id);

    List<UserDto> getAll();
}
