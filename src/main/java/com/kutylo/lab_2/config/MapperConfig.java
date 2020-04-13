package com.kutylo.lab_2.config;


import com.kutylo.lab_2.converter.CustomFromIdConverter;
import com.kutylo.lab_2.converter.TeamFromIdConverter;
import com.kutylo.lab_2.converter.UserFromIdConverter;
import com.kutylo.lab_2.dto.customDto.NewCustomDto;
import com.kutylo.lab_2.dto.planDto.NewPlanDto;
import com.kutylo.lab_2.dto.userDto.NewUserDto;
import com.kutylo.lab_2.mappers.CustomMapper;
import com.kutylo.lab_2.mappers.PlanMapper;
import com.kutylo.lab_2.mappers.UserMapper;
import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.model.Plan;
import com.kutylo.lab_2.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    private final UserMapper userMapper;
    private final CustomMapper customMapper;
    private final PlanMapper planMapper;

    private final UserFromIdConverter userFromIdConverter;
    private final CustomFromIdConverter customFromIdConverter;
    private final TeamFromIdConverter teamFromIdConverter;

    public MapperConfig(UserMapper userMapper, CustomMapper customMapper, PlanMapper planMapper, UserFromIdConverter userFromIdConverter, CustomFromIdConverter customFromIdConverter, TeamFromIdConverter teamFromIdConverter) {
        this.userMapper = userMapper;
        this.customMapper = customMapper;
        this.planMapper = planMapper;
        this.userFromIdConverter = userFromIdConverter;
        this.customFromIdConverter = customFromIdConverter;
        this.teamFromIdConverter = teamFromIdConverter;
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        modelMapper.addConverter(userFromIdConverter);

        modelMapper
                .createTypeMap(NewUserDto.class, User.class)
                .addMappings(userMapper);

        modelMapper
                .createTypeMap(NewCustomDto.class, Custom.class)
                .addMappings(customMapper);

        modelMapper
                .createTypeMap(NewPlanDto.class, Plan.class)
                .addMappings(planMapper);

        return modelMapper;
    }
}
