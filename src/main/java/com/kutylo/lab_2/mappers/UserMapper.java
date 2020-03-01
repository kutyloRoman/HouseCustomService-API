package com.kutylo.lab_2.mappers;

import com.kutylo.lab_2.dto.UserDto;
import com.kutylo.lab_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<User, UserDto> {

    @Autowired
    private  AddressMapper addressMapper;

    @Override
    public User convertToModel(UserDto userDto) {
        User user=new User();
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setEmail(userDto.getEmail());
        user.setAge(userDto.getAge());
        user.setPassword(userDto.getPassword());
        user.setPhoneNumber(userDto.getPhoneNumber());
        user.setAddress(addressMapper.convertToModel(userDto.getAddress()));

        return user;
    }

    @Override
    public UserDto convertToDto(User user) {

        UserDto userDto=new UserDto();
        userDto.setName(user.getName());
        userDto.setSurname(user.getSurname());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setPassword(user.getPassword());
        userDto.setAge(user.getAge());
        userDto.setAddress(addressMapper.convertToDto(user.getAddress()));

        return userDto;
    }
}
