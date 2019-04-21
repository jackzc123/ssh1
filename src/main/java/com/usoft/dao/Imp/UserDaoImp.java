package com.usoft.dao.Imp;

import com.usoft.dao.UserDao;
import com.usoft.entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/**
 * @author zc
 * @create 2019-04_21-12:20
 */
@Repository
public class UserDaoImp implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public boolean logined(UserEntity userEntity) {
        String sql = "from UserEntity where username=:uname and password=:pword";
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery(sql);
        query.setParameter("uname", userEntity.getUsername());
        query.setParameter("pword",userEntity.getPassword());
        UserEntity ue = (UserEntity)  query.list().get(0);
        if (ue != null) {
            return true;
        }
        return false;
    }
}
