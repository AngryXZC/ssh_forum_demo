package com.xzc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xzc
 * @date 2024/10/13 08 53:31
 * @description
 */
public class Paste {
    private String id;
    private String title;
    private String content;
    private int ansnum;
    private int offer;


    private int glanceOver;

    private String createTime;


    private User user;

    private Set<User> userAnswerSet=new HashSet<User>();

    public Set<User> getUserAnswerSet() {
        return userAnswerSet;
    }

    public void setUserAnswerSet(Set<User> userAnswerSet) {
        this.userAnswerSet = userAnswerSet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAnsnum() {
        return ansnum;
    }

    public void setAnsnum(int ansnum) {
        this.ansnum = ansnum;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }


    public int getGlanceOver() {
        return glanceOver;
    }

    public void setGlanceOver(int glanceOver) {
        this.glanceOver = glanceOver;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
