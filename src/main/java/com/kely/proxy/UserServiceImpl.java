package com.kely.proxy;

public class UserServiceImpl implements IUserService {
    @Override
    public void request() {
        System.out.println("this is userService");
    }
}