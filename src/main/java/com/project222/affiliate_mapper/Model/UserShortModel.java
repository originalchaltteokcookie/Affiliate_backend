package com.project222.affiliate_mapper.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserShortModel {
    private String id;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}