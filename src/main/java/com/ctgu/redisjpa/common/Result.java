package com.ctgu.redisjpa.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @Auther: yanghao
 * @Date: 2020/7/17 16:32
 * @PackageName:com.ctgu.redisjpa.demo.common
 * @Description: TODO
 * @Version:V1.0
 */
@Getter
@Setter
public class Result{
    private boolean success=true;
    private Integer code=200;
    private String msg="请求成功";
    private Object data=null;
}
