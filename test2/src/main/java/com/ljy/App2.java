package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-04 09:53
 * @描述:
 **/
@SpringBootApplication
@RestController
public class App2 {

    public static void main(String[] args){
        SpringApplication.run(App2.class,args);
    }

    @RequestMapping("test2")
    public String test2() {
    		System.out.println("test2健康");
    		return "test2 ok";
    }
}
