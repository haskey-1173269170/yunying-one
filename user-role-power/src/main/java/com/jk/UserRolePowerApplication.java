package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description <启动类>
 * @Param
 * @Return
 * @Author liushuxin
 * @Date 2019/11/18 19:09
 **/
@SpringBootApplication
@MapperScan("com.jk.*.mapper")
public class UserRolePowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRolePowerApplication.class, args);
    }

}
