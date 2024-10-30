package com.xzc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xzc
 * @date 2024/10/10 15 30:57
 * @description
 */


public class User {

    private String id;
    private String username;
    private String password;
    private String name;
    private String email;
    private String telephone;

    private Set<Paste> pasteSet=new HashSet<>();

    private Set<Paste> answerPasteSet=new HashSet<>();

    public Set<Paste> getAnswerPasteSet() {
        return answerPasteSet;
    }

    public void setAnswerPasteSet(Set<Paste> answerPasteSet) {
        this.answerPasteSet = answerPasteSet;
    }

    public Set<Paste> getPasteSet() {
        return pasteSet;
    }

    public void setPasteSet(Set<Paste> pasteSet) {
        this.pasteSet = pasteSet;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}

