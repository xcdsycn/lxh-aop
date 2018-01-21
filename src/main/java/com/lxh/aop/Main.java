package com.lxh.aop;
/**
 * Created by lxh on 2018/1/17.
 */

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lxh
 * @Date 2018/1/17
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAopDemo demo = (IAopDemo)context.getBean("aopDemo");
        System.out.println(demo.doSth("Mission One"));
    }
}
