package com.kutylo.lab_2.dto;

import io.swagger.annotations.ApiModelProperty;

public class CustomDto {

    @ApiModelProperty(example = "Electric")
    private String kindOfWork;

    @ApiModelProperty(example = "Big")
    private String scope;

    @ApiModelProperty(example = "3h")
    private String time;

    @ApiModelProperty(example = "register")
    private String status;

    private int userId;

    //------------------------------------------//

    public CustomDto() {
    }

    public String getKindOfWork() {
        return kindOfWork;
    }

    public void setKindOfWork(String kindOfWork) {
        this.kindOfWork = kindOfWork;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
