package com.xzc.service;

import com.xzc.dao.UserDao;
import com.xzc.domain.User;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @author xzc
 * @date 2024/10/10 15 34:38
 * @description
 */

//@Service("userService")
//<bean name="userService" class="com.xzc.service.UserService">
public class UserService {

//    @Autowired()
//    @Qualifier("userDao")
    private UserDao userDao ;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findUser(User user) throws SQLException {
        User temp = null;
        temp = userDao.findUser(user);
        return temp;
    }
    public void addUser(User user) throws SQLException {
        UserDao userDao = new UserDao();
        //打开事务
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        try {
            userDao.addUser(user);
        }catch (Exception e){
            transaction.rollback();
        }
        transaction.commit();

    }

}
