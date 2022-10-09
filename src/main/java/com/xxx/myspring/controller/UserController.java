package com.xxx.myspring.controller;

import com.xxx.myspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller //加到控制层spring会去找controller包下加了注解的类，创建bean
public class UserController {
    /**
     * 从ioc容器中，根据类型获取bean
     */
    @Autowired
    private UserService userService;

    public String queryUserInfo(String userId) {

        //控制层 不做业务逻辑 空判断 获取请求参数 调用service层 封装对象返回
        String rl = userService.queryByUserId(userId);
        return rl;
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController = applicationContext.getBean("userController", UserController.class);
        String rl = userController.queryUserInfo("123");
        System.out.println(rl);
    }
}
