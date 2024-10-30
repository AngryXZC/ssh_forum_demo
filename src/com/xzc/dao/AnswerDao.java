package com.xzc.dao;

import com.xzc.domain.Answer;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @author xzc
 * @date 2024/10/23 10 01:58
 * @description
 */
public class AnswerDao  extends HibernateDaoSupport {
    public void addAnswer(Answer answer) {
        Session session=getHibernateTemplate().getSessionFactory().getCurrentSession();
        session.save(answer);
    }
}
