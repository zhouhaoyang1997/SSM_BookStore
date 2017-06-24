package com.service;

import com.entry.User;

/**
 * Created by Administrator on 2017/6/24.
 */
public interface UserService {
    public User selectById(int id);
    public boolean register(User user);
    public boolean login(User user);
}
