package com.zfc.study.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import service.DemoService;

/**
 * @Author zufeichao
 * @ProjectName springbootdubboparent
 * @Description TODO
 * @Date 2019-06-17 11:07
 **/
@RestController
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name){
        return demoService.sayHello(name);
    }

}
