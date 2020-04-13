package com.kutylo.lab_2.dto.teamDto;

import io.swagger.annotations.ApiModelProperty;

public class NewTeamDto {
    @ApiModelProperty(example = "5")
    private int amount;
    @ApiModelProperty(example = "Some description")
    private String description;

    //-------------------------------------------------------//

    public NewTeamDto() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
