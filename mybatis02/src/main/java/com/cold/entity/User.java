package com.cold.entity;

public class User {

    private Integer tId;
    private String tName;
    private String tPassword;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettPassword() {
        return tPassword;
    }

    public void settPassword(String tPassword) {
        this.tPassword = tPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tPassword='" + tPassword + '\'' +
                '}';
    }
}
