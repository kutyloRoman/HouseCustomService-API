package com.kutylo.lab_2.converter;

import com.kutylo.lab_2.dao.UserDao;
import com.kutylo.lab_2.model.User;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserFromIdConverter implements Converter<Integer, User> {

    @Autowired
    private UserDao userDao;

    @Override
    public User convert(MappingContext<Integer, User> mappingContext) {
        if (mappingContext.getSource() != null) {
            return userDao.getById(mappingContext.getSource());
        }
        return null;
    }
}
