package com.example.springboot.user.controller;

import com.example.springboot.user.bean.User;
import com.example.springboot.user.mapper.UserMapper;
import com.example.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author yt
 * @version 1.0
 * @description: TODO
 * @date 2021/1/18 10:11
 */
@RestController
public class UserController {

    @Autowired
    private User user;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @RequestMapping("findPage")
    public List<User> findPage(int page,int rows) {
        return userService.findPage(page,rows);
    }


    @RequestMapping("findUser")
    public String findUser(Model m) {
        m.addAttribute("mes", user.getUserName() + "-" + user.getAge());
        return "hello";
    }

    @RequestMapping("findAllUser")
    public void findAllUser() {
        List<Map> allUser = userMapper.findAllUser();
        System.out.println();
        System.out.println(allUser);
    }

}
