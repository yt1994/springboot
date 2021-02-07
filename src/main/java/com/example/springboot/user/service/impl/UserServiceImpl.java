package com.example.springboot.user.service.impl;/**
 * Description: springboot
 * <p>
 * Created by yt on 2021/2/4 17:25
 */

import com.example.springboot.user.bean.User;
import com.example.springboot.user.mapper.UserMapper;
import com.example.springboot.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yt
 * @version 1.0
 * @description: TODO
 * @date 2021/2/4 17:25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findPage(int page, int rows) {
        PageHelper.startPage(page,rows);
        List<User> page1 = userMapper.findPage();
        return page1;
    }
}
