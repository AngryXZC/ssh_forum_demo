package com.xzc.dao;

import com.xzc.domain.Paste;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import java.util.List;

/**
 * @author xzc
 * @date 2024/10/13 08 55:41
 * @description
 */
public class PasteDao extends HibernateDaoSupport  {
    public List<Paste> getAllPaste() throws SQLException {

        Session session=getHibernateTemplate().getSessionFactory().getCurrentSession();

        List<Paste> pasteList = session.createQuery("FROM Paste", Paste.class).list();

        return pasteList;
    }

    public void addPaste(Paste paste) {
        Session session=getHibernateTemplate().getSessionFactory().getCurrentSession();
        session.save(paste);

    }

    public Paste findPasteById(String pasteid) {
        Session session=getHibernateTemplate().getSessionFactory().getCurrentSession();
        return  session.get(Paste.class,pasteid);
    }
}
