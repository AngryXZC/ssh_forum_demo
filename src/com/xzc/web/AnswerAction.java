package com.xzc.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xzc.domain.Answer;
import com.xzc.domain.Paste;
import com.xzc.domain.User;
import com.xzc.service.AnswerService;
import com.xzc.service.PasteService;

/**
 * @author xzc
 * @date 2024/10/22 08 56:55
 * @description
 */
public class AnswerAction extends ActionSupport implements ModelDriven<Answer> {

    public Answer answer=new Answer();
    public String pasteid;

   private AnswerService answerService;

    public AnswerService getAnswerService() {
        return answerService;
    }

    public void setAnswerService(AnswerService answerService) {
        this.answerService = answerService;
    }

    public String addAnswer() throws Exception {


        PasteService pasteService=new PasteService();
        Paste paste= pasteService.findPasteById(pasteid);
        answer.setPaste(paste);


        User user= (User) ActionContext.getContext().getSession().get("user");
        answer.setUser(user);
        answerService.addAnswer(answer);
        System.out.println("pasteid"+"---"+answer.getContent());
        return  "success";
    }

    @Override
    public Answer getModel() {
        return answer;
    }

    public String getPasteid() {
        return pasteid;
    }

    public void setPasteid(String pasteid) {
        this.pasteid = pasteid;
    }
}
