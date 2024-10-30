package com.xzc.service;

import com.xzc.dao.PasteDao;
import com.xzc.domain.Paste;
import com.xzc.utils.HibernateUtils;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

/**
 * @author xzc
 * @date 2024/10/13 08 53:11
 * @description
 */
public class PasteService {
    private PasteDao pasteDao ;

    public PasteDao getPasteDao() {
        return pasteDao;
    }

    public void setPasteDao(PasteDao pasteDao) {
        this.pasteDao = pasteDao;
    }

    public List<Paste> getAllPaste() throws SQLException {

        return pasteDao.getAllPaste();
    }

    public void addPaste(Paste paste) {
            pasteDao.addPaste(paste);
    }

    public Paste findPasteById(String pasteid) {

        Paste paste=null;
        paste=pasteDao.findPasteById(pasteid);
        return paste;
    }
}
