package com.ljy.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @类名: com.ljy.api
 * @作者:
 * @创建时间: 2019-12-04 09:44
 * @描述:
 **/
@FeignClient(name = "ribbon02")
public interface TestApi {

    @RequestMapping("test02")
    public String test1(@RequestParam String name);

}
