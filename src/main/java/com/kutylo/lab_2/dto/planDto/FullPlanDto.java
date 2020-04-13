package com.kutylo.lab_2.dto.planDto;

import com.kutylo.lab_2.dto.customDto.CustomDto;
import com.kutylo.lab_2.dto.teamDto.TeamDto;
import com.kutylo.lab_2.dto.userDto.UserDto;

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
