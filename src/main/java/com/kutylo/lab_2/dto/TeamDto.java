package com.kutylo.lab_2.dto;

import io.swagger.annotations.ApiModelProperty;

public class TeamDto {
    @ApiModelProperty(example = "5")
    private int amount;

    //-----------------------------------//

    public TeamDto() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
