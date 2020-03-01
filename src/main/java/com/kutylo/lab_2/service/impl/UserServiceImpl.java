package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.UserDao;
import com.kutylo.lab_2.dto.UserDto;
import com.kutylo.lab_2.mappers.UserMapper;
import com.kutylo.lab_2.model.User;
import com.kutylo.lab_2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserDao userDao;

    @Override
    public UserDto save(UserDto user) {
        User newUser=userMapper.convertToModel(user);
        userDao.save(newUser);

        return userMapper.convertToDto(newUser);
    }

    @Override
    public UserDto update(UserDto user) {
//        User oldUser = getById(userId);
//        delete(userId);
//        save(user);

        userDao.update(userMapper.convertToModel(user));
        return user;
    }

    @Override
    public void delete(int id) {
        User user=getById(id);
        userDao.delete(user);

    }

    @Override
    public User getById(int id) {

        return userDao.getById(id);
    }

    @Override
    public UserDto getByAddressId(int id) {

        return null;
    }

    @Override
    public List<User> getAll() {

        return userDao.getAll();
    }
}
