package com.ctgu.redisjpa.service;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 15:07
 * @PackageName:com.ctgu.redisjpa.demo.service
 * @Description: TODO
 * @Version:V1.0
 */
public interface RedisService {
    Object get(String key);
    void delete(String key);
    void set(String key,Object object);
    void expire(Integer expireTime);
    void set(String key,Object object,Integer expireTime);
    void incrKey(String key);
    String getIncrKey(String key);
    boolean isExists(String key);
}
