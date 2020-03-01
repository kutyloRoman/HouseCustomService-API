package com.kutylo.lab_2.dto;


import io.swagger.annotations.ApiModelProperty;

public class UserDto {

    @ApiModelProperty(example = "Roman")
    private String name;

    @ApiModelProperty(example = "Romanov")
    private String surname;

    @ApiModelProperty(example = "Roman123")
    private String password;

    @ApiModelProperty(example = "Roman@gmail.com")
    private String email;

    @ApiModelProperty(example = "098234")
    private String phoneNumber;

    @ApiModelProperty(example = "25")
    private int age;


    private AddressDto address;

    public UserDto() {
    }

    public UserDto( String name, String surname, String password, String email, String phoneNumber, int age, AddressDto address) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressDto getAddress() {
        return address;
    }

    public void setAddress(AddressDto address) {
        this.address = address;
    }
}