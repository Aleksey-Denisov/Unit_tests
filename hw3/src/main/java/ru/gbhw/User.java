package ru.gbhw;

public class User {
    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isAuthenticate = true;
    }

    public boolean getAdmin(){
        return isAdmin;
    }

    public boolean getAuthenticate() {
        return isAuthenticate;
    }

    public void setAuthenticate(boolean isAuthenticate){
        this.isAuthenticate = isAuthenticate;
    }
}
