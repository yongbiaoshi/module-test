package com.my.test.user.service;


public class UserService {

    public String hello() {
        return "Hello World, I'm " + getClass().getModule() + " " + getClass().getName();
    }

}
