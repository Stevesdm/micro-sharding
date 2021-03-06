package com.steve.main;

import com.steve.service.TestService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: stevejobson
 * @CreateDate: 2018/1/6 下午5:40
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.steve.dao") //或者使用在Mapper类上添加@Mapper的方法
@ComponentScan("com.steve")
public class App {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(App.class,args);
        context.getBean(TestService.class).demo();
    }
}
