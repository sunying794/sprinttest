package com.mashibing.aop;

public class Mom {

    public void buy(){//前置通知
        System.out.println("前置---买水果");
    }

    public void clear(){//后置通知
        System.out.println("后置---收拾果核");
    }

}
