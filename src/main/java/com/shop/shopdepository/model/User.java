package com.shop.shopdepository.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("User")
public class User {
    private Integer userId;
    private String userName;
    private String password;
    private String avatar;
    private String phoneNum;
    private String eMail;
    private String role;

}
