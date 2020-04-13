package com.kutylo.lab_2.converter;

import com.kutylo.lab_2.dao.CustomDao;
import com.kutylo.lab_2.dao.UserDao;
import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.model.User;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomFromIdConverter implements Converter<Integer, Custom> {

    @Autowired
    private CustomDao customDao;

    @Override
    public Custom convert(MappingContext<Integer, Custom> mappingContext) {
        if (mappingContext.getSource() != null) {
            return customDao.getById(mappingContext.getSource());
        }
        return null;
    }
}
