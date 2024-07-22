package com.shop.shopdepository;

import com.shop.shopdepository.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.shop.shopdepository.model.User;

import java.util.List;

@SpringBootTest
class ShopDepositoryApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        //参数是一个wrapper ，条件构造器，这里我们先不用 null
        List<User> userList = userMapper.selectList(null);//查询全部的用户
        userList.forEach(System.out::println);
    }

}
