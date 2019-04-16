package com.my.test.api;

import com.my.test.account.service.AccountService;
import com.my.test.user.service.UserService;

public class Main {

    public static void main(String[] args) {
        AccountService as = new AccountService();
        UserService us = new UserService();
        System.out.println(as.hello());
        System.out.println(us.hello());
    }

}
