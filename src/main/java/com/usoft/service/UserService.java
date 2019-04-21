package com.usoft.service;

import com.usoft.dao.UserDao;
import com.usoft.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zc
 * @create 2019-04_21-12:34
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean logined(UserEntity userEntity){
        return userDao.logined(userEntity);
    }

}
