package com.ctgu.redisjpa.controller;

import com.ctgu.redisjpa.service.RedisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 15:04
 * @PackageName:com.ctgu.redisjpa.demo.controller
 * @Description: TODO
 * @Version:V1.0
 *
 */
@RestController
@RequestMapping("/redis/")
@Slf4j
public class RedisController {
    @Autowired
    RedisService redisService;

    @GetMapping("/view")
    public String getViewTimes(){
        String key="view-times";
        log.info("浏览量：{}",redisService.getIncrKey(key));
        return redisService.getIncrKey(key);
    }
}
