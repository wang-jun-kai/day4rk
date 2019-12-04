package com.ljy.web;

import com.ljy.api.TestApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy.web
 * @作者:
 * @创建时间: 2019-12-04 09:49
 * @描述:
 **/
@RestController
public class Test1Controller {

    @Autowired
    TestApi testApi;

    @RequestMapping("test222d/{name}")
//    @HystrixCommand(fallbackMethod = "testBack")
    public String test01(@PathVariable String name) {
        return testApi.test1(name);
    }

//    //报错测试
//    public String testBack(String name) {
//        return "error"+name;
//    }
}
