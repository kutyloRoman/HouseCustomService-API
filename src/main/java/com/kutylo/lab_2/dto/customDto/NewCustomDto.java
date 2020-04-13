package com.kutylo.lab_2.dto.customDto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;

public class NewCustomDto {
    @JsonIgnore
    private int id;

    @ApiModelProperty(example = "Electric")
    private String kindOfWork;

    @ApiModelProperty(example = "Big")
    private String scope;

    @ApiModelProperty(example = "3h")
    private String time;

    @JsonIgnore
    private String status;

    @ApiModelProperty(example = "1")
    private int userId;

    //--------------------------------------------//

    public NewCustomDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
