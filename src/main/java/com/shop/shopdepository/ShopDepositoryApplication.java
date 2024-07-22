package com.shop.shopdepository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shop.shopdepository.mapper")
public class ShopDepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopDepositoryApplication.class, args);
    }

}
