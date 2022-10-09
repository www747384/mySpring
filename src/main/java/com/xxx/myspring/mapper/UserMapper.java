package com.xxx.myspring.mapper;

import com.xxx.myspring.utils.DbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository//加到持久层 spring会找到Service包下
public class UserMapper {

    @Autowired
    private DbUtil dbUtil;

    public String selectByUserId(String userId) {

        //获取连接 操作数据库
        System.out.println(dbUtil.getCon());

        //执行sql
        return "success";
    }
}
