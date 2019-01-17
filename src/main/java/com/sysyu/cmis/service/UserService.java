package com.sysyu.cmis.service;

import com.sysyu.cmis.bean.User;

import java.util.List;

public interface UserService {
    User getUserById(long id);
    List<User> getAll();
    int addUser(User user);
}
