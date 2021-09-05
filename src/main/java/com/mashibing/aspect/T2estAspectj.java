package com.mashibing.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Component("t2estAspect")
//@Aspect
public class T2estAspectj{

//    @After("@annotation(com.mashibing.aspect.bean.CustArray)")
    public void a1fterann(JoinPoint jp){
        System.out.println("吃完后刷牙 a1fterann...");
    }


//    @Before("@annotation(com.mashibing.aspect.bean.CustArray)")
    public void b1efore(JoinPoint jp){
        System.out.println("吃完后刷牙 b1efore...");
    }

}
