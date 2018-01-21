package com.lxh.aop;
/**
 * Created by lxh on 2018/1/17.
 */

/**
 * @author lxh
 * @Date 2018/1/17
 */
public class AopDemo implements IAopDemo {
    @Override
    public String doSth(String task) {
        System.out.println("do somthing.........."+task);
        return task;
    }
}
