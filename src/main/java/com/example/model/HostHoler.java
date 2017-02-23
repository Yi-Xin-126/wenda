package com.example.model;

import org.springframework.stereotype.Component;

/**
 * Created by YiXin on 2017/2/23.
 */
@Component
public class HostHoler {
    private static ThreadLocal<User> users = new ThreadLocal<User>();

    public User getUser() {
        return users.get();
    }

    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();
    }

}
