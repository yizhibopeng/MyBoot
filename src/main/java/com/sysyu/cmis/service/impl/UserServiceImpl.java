package com.sysyu.cmis.service.impl;

import com.sysyu.cmis.bean.User;
import com.sysyu.cmis.dao.UserMapper;
import com.sysyu.cmis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yupeng
 * @description
 * @date 2019/1/16 0016 18:20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(long id) {
        return userMapper.findById(id);
    }
    @Override
    public List<User> getAll() {
        return userMapper.findUserList();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}
