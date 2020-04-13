package com.kutylo.lab_2.dto.addressDto;


import io.swagger.annotations.ApiModelProperty;

public class AddressDto {
    private int id;

    @ApiModelProperty(example = "Lviv")
    private String city;

    @ApiModelProperty(example = "Torfiana")
    private String street;

    @ApiModelProperty(example = "8a")
    private String build;

    //--------------------------------------------------------///
    public AddressDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }
}
