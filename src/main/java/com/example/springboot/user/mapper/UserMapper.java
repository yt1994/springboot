package com.example.springboot.user.mapper;/**
 * Description: springboot
 * <p>
 * Created by yt on 2021/1/18 11:39
 */

import com.example.springboot.user.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @description: TODO
 * @author yt
 * @date 2021/1/18 11:39
 * @version 1.0
 */
@Mapper
public interface UserMapper {

    @Select("select * from management_account")
    List<Map> findAllUser();

    @Select("SELECT acc_id as age,acc_name userName from management_account")
    List<User> findPage();
}
