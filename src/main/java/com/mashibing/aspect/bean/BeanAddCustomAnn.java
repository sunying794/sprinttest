package com.mashibing.aspect.bean;

import org.springframework.stereotype.Component;

/**
 * 实现类
 */
@Component("beanAddCustomAnn")
public class BeanAddCustomAnn implements  AddCustomAnnImpl{



    @CustomAnn(username = "sunying", custArray = {
            @CustArray(url = "#bean1.username",address = "武汉"),
            @CustArray(url = "#bean.password",address = "北京"),
            @CustArray(url = "#bean.address",address = "广东")
    })
//    @CustArray(address = "球场街")
    public void testprint1(TestBean bean){
        System.out.println("正在吃苹果---------testprint1");
    }



//    @Myann
//    public void testprint2(String str){
//        System.out.println("使用了注解---------testprint2");
//    }
//
//    public void testprint3(String str){
//        System.out.println("使用了注解---------");
//    }
}
