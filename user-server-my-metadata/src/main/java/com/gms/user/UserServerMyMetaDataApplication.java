package com.gms.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.gms.user.dao")
public class UserServerMyMetaDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServerMyMetaDataApplication.class, args);
    }

}
