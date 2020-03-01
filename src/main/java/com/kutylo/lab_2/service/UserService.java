package com.kutylo.lab_2.service;

import com.kutylo.lab_2.dao.UserDao;
import com.kutylo.lab_2.dto.UserDto;
import com.kutylo.lab_2.model.Address;
import com.kutylo.lab_2.model.User;

import java.util.List;

public interface UserService {
    UserDto save(UserDto user);

    UserDto update(UserDto user);

    void delete(int id);

    User getById(int id);

    UserDto getByAddressId(int id);

    List<User> getAll();
}
