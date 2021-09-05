package com.mashibing.aspect.bean;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD })
public @interface CustArray {

    public String url() default "d_url";
    public String address() default "d_address";

}
