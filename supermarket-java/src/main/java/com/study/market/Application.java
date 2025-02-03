package com.study.market;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        //SpringBoot 执行启动
        SpringApplication.run(Application.class, args);

        log.info("=====================项目后端启动成功============================");
    }

}
