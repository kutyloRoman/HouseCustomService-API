package com.kutylo.lab_2.dto.teamDto;


public class TeamDto {

    private int id;
    private int amount;
    private String description;

    //-----------------------------------//

    public TeamDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
