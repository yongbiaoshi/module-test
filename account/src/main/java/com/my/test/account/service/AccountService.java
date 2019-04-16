package com.my.test.account.service;

public class AccountService {

    public String hello() {
        return "Hello World, I'm " + getClass().getModule() + " " + getClass().getName();
    }

}
