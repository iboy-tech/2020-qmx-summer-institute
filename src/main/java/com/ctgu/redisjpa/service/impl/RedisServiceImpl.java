package com.ctgu.redisjpa.service.impl;

import com.ctgu.redisjpa.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 18:41
 * @PackageName:com.ctgu.redisjpa.service.impl
 * @Description: TODO
 * @Version:V1.0
 */
@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;


    @Override
    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    @Override
    public void delete(String key) {
        redisTemplate.delete(key);
    }

    @Override
    public void set(String key, Object object) {
       redisTemplate.opsForValue().set(key,object);
    }

    @Override
    public void expire(Integer expireTime) {

    }

    @Override
    public void set(String key, Object object, Integer expireTime) {

    }

    @Override
    public void incrKey(String key) {
        stringRedisTemplate.opsForValue().increment(key);
    }

    @Override
    public String getIncrKey(String key) {

        return stringRedisTemplate.opsForValue().get(key) ;
    }

    @Override
    public boolean isExists(String key) {
        return redisTemplate.hasKey(key);
    }
}
