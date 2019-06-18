package com.zfc.study;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zufeichao
 * @Description @EnableDubbo 注解开启Springboot对dubbo的支持
 * @Date 10:40 2019/6/17
 * @Param
 * @return
 **/
@EnableDubbo
@SpringBootApplication
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
