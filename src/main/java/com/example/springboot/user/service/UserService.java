package com.example.springboot.user.service;

import com.example.springboot.user.bean.User;

import java.util.List;
import java.util.Map;

/**
 * Description: springboot
 * <p>
 * Created by yt on 2021/2/4 17:25
 */
public interface UserService {
    List<User> findPage(int page, int rows);
}
