package com.zfc.study.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import service.DemoService;

/**
 * @Author zufeichao
 * @ProjectName springbootdubboparent
 * @Description @Service 注解是dubbo的，注解中我们指定了版本号为配置文件中自定义的属性
 *              实现api模块中的service
 * @Date 2019-06-17 10:46
 **/
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", I'm provider !";
    }
}
