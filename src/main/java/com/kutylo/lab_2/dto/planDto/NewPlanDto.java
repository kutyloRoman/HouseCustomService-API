package com.kutylo.lab_2.dto.planDto;

import io.swagger.annotations.ApiModelProperty;

public class NewPlanDto {

    @ApiModelProperty(example = "12.03.2020")
    private String date;

    @ApiModelProperty(example = "250")
    private int price;

    private int customId;

    private int teamId;

    //-------------------------------------------------//

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

    public int getCustomId() {
        return customId;
    }

    public void setCustomId(int customId) {
        this.customId = customId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
