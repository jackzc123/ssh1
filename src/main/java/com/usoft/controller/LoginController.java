package com.usoft.controller;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.usoft.entity.UserEntity;
import com.usoft.service.UserService;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @author zc
 * @create 2019-04_21-12:03
 */
@Controller
@Scope("prototype")
public class LoginController extends ActionSupport implements ModelDriven<UserEntity>
        ,Preparable, RequestAware {

    private UserEntity user;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Autowired
    private UserService userService;

    public String login(){
        if (userService.logined(user)) {
            System.out.println(user);
            map.put("user", user);
            map.put("abc","abc1");

            System.out.println(map.get("user"));
            return "success";
        }
        return "index";
    }

    public void prepareLogin(){
        user = new UserEntity();
    }

    @Override
    public void prepare() {

    }

    @Override
    public UserEntity getModel() {
        return user;
    }

    private Map<String, Object> map;

    @Override
    public void setRequest(Map<String, Object> map) {
        this.map = map;
    }
}
