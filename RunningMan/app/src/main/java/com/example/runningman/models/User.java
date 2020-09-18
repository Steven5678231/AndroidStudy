package com.example.runningman.models;

public class User {
    private String email;
    private String user_id;
    private String username;
    private String extraInfo;

    public User(){

    }

    public User(String email, String user_id, String username, String extraInfo) {
        this.email = email;
        this.user_id = user_id;
        this.username = username;
        this.extraInfo = extraInfo;
    }

    public String getEmail() {
        return email;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public String getExtraInfo() {
        return extraInfo;
    }
}
