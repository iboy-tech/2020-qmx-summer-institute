package com.ctgu.redisjpa.util;

import com.ctgu.redisjpa.common.Result;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 16:31
 * @PackageName:com.ctgu.redisjpa.util
 * @Description: TODO
 * @Version:V1.0
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result=new Result();
        result.setData(object);
        return result;
    }
    public static Result success(Integer code,Object object){
        Result result=new Result();
        result.setCode(code);
        result.setData(object);
        return result;
    }
    public static Result success(){
        Result result=new Result();
        return result;
    }
    public static Result success(String msg,Object object){
        Result result=new Result();
        result.setMsg(msg);
        result.setData(object);
        return result;
    }
    public static Result error(){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(-1);
        result.setMsg("请求失败");
        return result;
    }
    public static Result error(String msg){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(-1);
        result.setMsg(msg);
        return result;
    }
}
