package com.xzc.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xzc.domain.Paste;
import com.xzc.domain.User;
import com.xzc.service.PasteService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author xzc
 * @date 2024/10/13 08 50:35
 * @description
 */
public class PasteAction extends ActionSupport  implements ModelDriven<Paste> {

    public Paste paste=new Paste();

    private PasteService pasteService ;

    public PasteService getPasteService() {
        return pasteService;
    }

    public void setPasteService(PasteService pasteService) {
        this.pasteService = pasteService;
    }

    public String getAllPaste() throws Exception {

        List<Paste> pasteList = pasteService.getAllPaste();
        ActionContext.getContext().put("pasteList",pasteList);

        return  "toIndex";
    }

    public  String addPaste(){
        //手动封装没有的数据
        paste.setAnsnum(0);
        paste.setGlanceOver(0);
        Date date=new Date(System.currentTimeMillis());
        SimpleDateFormat format=new SimpleDateFormat("yy-yy-dd hh:mm:ss");
        String createTime= format.format(date);
        paste.setCreateTime(createTime);

        User user=(User) ActionContext.getContext().getSession().get("user");
        paste.setUser(user);

        pasteService.addPaste(paste);


        return "toIndex";
    }
    @Override
    public Paste getModel() {
        return paste;
    }
}
