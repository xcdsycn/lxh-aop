package com.lxh.aop;
/**
 * Created by lxh on 2018/1/17.
 */

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author lxh
 * @Date 2018/1/17
 */
public class Listener {
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("beginning----");
        Object object = pjp.proceed();    //运行doSth()，返回值用一个Object类型来接收
//        object = "Mission Two";   //改变返回值
        System.out.println("ending----");
        return "hello";
    }
}
