package com.ljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @类名: com.ljy
 * @作者:
 * @创建时间: 2019-12-04 09:43
 * @描述:
 **/
@SpringBootApplication
@RestController
@EnableFeignClients
public class App1 {
   public static void main(String[] args){
       SpringApplication.run(App1.class,args);
   }

   @RequestMapping("test1")
    public String test1() {
       System.out.println("test1健康");
        return "test1 ok";
    }

}
