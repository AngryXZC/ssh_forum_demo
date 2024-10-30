package com.xzc.web;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.xzc.domain.User;
import com.xzc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


/**
 * @author xzc
 * @date 2024/10/10 15 25:31
 * @description
 */
//@Controller("userAction")
//@Scope(scopeName ="prototype" )
//<bean name="userAction" class="com.xzc.web.UserAction" scope="prototype" >
public class UserAction extends ActionSupport  implements ModelDriven<User> {
    public User user = new User();

//    @Autowired()//自动装配
    //如果匹配到多个类型一致的对象，将无法注解
    //@Qualifier("userService")
//    @Resource(name = "userService")
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public String login() throws Exception {

        User temp = userService.findUser(user);
        if(temp!=null){
            ActionContext.getContext().getSession().put("user",temp);
            ActionContext.getContext().put("user",temp);
            return "toIndex";
        }
        else {
            ActionContext.getContext().put("error","用户名或密码错误!!!");
            return "toLogin";
        }
    }

    public String register() throws Exception {


//        user.setId(UUID.randomUUID().toString());

        UserService userService = new UserService();
        userService.addUser(user);

        return "toLogin";
    }


    @Override
    public User getModel() {
        return user;
    }
}
