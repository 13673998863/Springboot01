package com.java.service;

import com.java.entity.User;
import com.java.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User queryUserById(Long i) {
        return  userMapper.selectByPrimaryKey(i);
    }
    @Transactional
    public void deleteUserById(Long id) {
        userMapper.deleteByPrimaryKey(id);
    }

    public List<User> queryAllUser() {

        return  userMapper.selectAll();
    }
}
