package com.kutylo.lab_2.dto;

import com.kutylo.lab_2.model.Custom;
import com.kutylo.lab_2.model.Team;
import io.swagger.annotations.ApiModelProperty;

public class FullPlanDto {

    private UserDto userDto;

    private CustomDto custom;

    private TeamDto team;

    private String date;

    private int price;

    //--------------------------------------------//

    public FullPlanDto() {
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CustomDto getCustom() {
        return custom;
    }

    public void setCustom(CustomDto custom) {
        this.custom = custom;
    }

    public TeamDto getTeam() {
        return team;
    }

    public void setTeam(TeamDto team) {
        this.team = team;
    }
}
