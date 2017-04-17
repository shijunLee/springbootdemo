package com.lee.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lee.springbootdemo.mapper.UserInfoMapper;
import com.lee.springbootdemo.model.UserInfo;
/**
 * Created by 李士军 on 2017/4/17.
 */

@Controller
public class IndexController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @RequestMapping(value="index/{id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody String  index(@PathVariable Long id)
    {

        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(id);
        String returnValue = JSON.toJSONString(userInfo);
        return returnValue;
    }
}
