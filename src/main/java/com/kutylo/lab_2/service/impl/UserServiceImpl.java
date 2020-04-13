package com.kutylo.lab_2.service.impl;

import com.kutylo.lab_2.dao.UserDao;
import com.kutylo.lab_2.dto.userDto.NewUserDto;
import com.kutylo.lab_2.dto.userDto.UserDto;
import com.kutylo.lab_2.model.User;
import com.kutylo.lab_2.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto save(NewUserDto user) {
        User newUser=modelMapper.map(user,User.class);
        userDao.save(newUser);
        return modelMapper.map(newUser,UserDto.class);
    }


    @Override
    public UserDto update(NewUserDto user,int id) {
        User updateUser=modelMapper.map(user,User.class);
        updateUser.setId(id);
        userDao.update(updateUser);
        return modelMapper.map(updateUser,UserDto.class);
    }

    @Override
    public void delete(int id) {
        userDao.delete(userDao.getById(id));
    }

    @Override
    public UserDto getById(int id) {
        return modelMapper.map(userDao.getById(id),UserDto.class);
    }

    @Override
    public UserDto getByAddressId(int id) {
        User user=userDao.getAll().stream()
                .filter(u->u.getAddress().getId()==id)
                .collect(Collectors.toList())
                .get(0);
        return modelMapper.map(user,UserDto.class);
    }

    @Override
    public List<UserDto> getAll() {
        return userDao.getAll().stream()
                .map(u->modelMapper.map(u,UserDto.class))
                .collect(Collectors.toList());
    }
}
