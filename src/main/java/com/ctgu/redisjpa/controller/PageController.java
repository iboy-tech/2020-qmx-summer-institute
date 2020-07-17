package com.ctgu.redisjpa.controller;

import com.ctgu.redisjpa.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 15:05
 * @PackageName:com.ctgu.redisjpa.demo.controller
 * @Description: TODO
 * @Version:V1.0
 */
@Controller
@Slf4j
public class PageController {
    @Autowired
    private RedisService redisService;
    @GetMapping("/hello")
    @ResponseBody
    public String indexHello(){
        return "Hello World!";
    }

    @GetMapping("/")
    public String indexHtml(){
        log.info("请求index");
        String key="view-times";
        redisService.incrKey(key);
        return "index";
    }

}
