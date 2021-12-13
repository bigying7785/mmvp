package com.company.dao.entity;

public class Tuser {
    private int id;
    private String username;
    private String password;
    private int pri;

    public Tuser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPri() {
        return pri;
    }

    public void setPri(int pri) {
        this.pri = pri;
    }

    public Tuser(int id, String username, String password, int pri) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.pri = pri;
    }

    @Override
    public String toString() {
        return "Tuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", pri=" + pri +
                '}';
    }
}
