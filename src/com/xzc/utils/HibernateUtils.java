package com.xzc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author xzc
 * @date 2024/10/17 03 05:25
 * @description
 */
public class HibernateUtils {
    private static SessionFactory sessionFactory=null;

    static {

        Configuration config=new Configuration().configure();
        sessionFactory= config.buildSessionFactory();
    }

    //获取全新的session
    public static Session getSession(){
        //获取session
        Session session=sessionFactory.openSession();
        return session;
    }
    //获取当前session
    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
