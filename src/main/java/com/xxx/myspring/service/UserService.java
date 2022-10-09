package com.xxx.myspring.service;

import com.xxx.myspring.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service //加到业务层 spring会找到Service包下 加了注解的类 创建bean 放到ioc容器中
public class UserService {

    @Autowired
    //@Resource
    private UserMapper userMapper;

    /**
     * 根据用户id查询用户信息请求
     *
     * @param userId
     * @return
     */
    public String queryByUserId(String userId) {
        //调用mapper层 业务逻辑处理
        String rl = userMapper.selectByUserId(userId);
        return rl;
    }
}
