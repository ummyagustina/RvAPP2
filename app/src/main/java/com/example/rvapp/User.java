package com.example.rvapp;

public class User {
    private String username;
    private String powerrr;
    private int image;

    public User(String username, String powerrr, int image) {
        this.username = username;
        this.powerrr = powerrr;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPowerrr() {
        return powerrr;
    }

    public void setPowerrr(String powerrr) {
        this.powerrr = powerrr;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}