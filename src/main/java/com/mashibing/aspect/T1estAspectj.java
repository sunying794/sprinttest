package com.mashibing.aspect;

import com.mashibing.aspect.bean.CustArray;
import com.mashibing.aspect.bean.CustomAnn;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("testAspect")
@Aspect
public class T1estAspectj{//} implements BeanFactoryAware, ApplicationContextAware {

    /**
     * 带自定义注解Myann的方法在被调用后执行
     */
//    @After("@annotation(com.mashibing.aspect.bean.CustomAnn) && @annotation(myann)")
//    @After("@annotation(com.mashibing.aspect.bean.CustomAnn)")
//    public void afterann(JoinPoint jp){
//        System.out.println("吃完后刷牙 advice...");
//    }
//

    @Before("@annotation(com.mashibing.aspect.bean.CustomAnn) && @annotation(customAnn) "/* +
            "&& @annotation(com.mashibing.aspect.bean.CustArray) && @annotation(custArray)"*/)
    public void beforeann(JoinPoint jp, CustomAnn customAnn/*,CustArray custArray*/){
        CustArray[] ca = customAnn.custArray();
//        System.out.println(custArray.address());
        System.out.println(ca);
        System.out.println(jp);
        System.out.println("吃之前洗手 advice...");
    }

//    @AfterReturning("@annotation(com.mashibing.aspect.bean.CustomAnn)")
//    public void afterReturning(JoinPoint jp){
//        System.out.println("afterReturning advice...");
//    }

//    @AfterThrowing("@annotation(com.mashibing.aspect.bean.CustomAnn)")
//    public void afterThrowing(JoinPoint jp){
//        System.out.println("afterThrowing advice...");
//    }

//    @Around("@annotation(com.mashibing.aspect.bean.CustomAnn)")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("around advice...");
//        return pjp.proceed(pjp.getArgs());
//    }




    /*

     */
/**
 * 前置通知：目标方法执行之前执行以下方法体的内容
 * @param jp
 *//*

    @Before("execution(* com.mashibing.aspect.bean.TestAnn.*(..))")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("【前置通知】the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
    }

    */
    /**
     * 后置通知：目标方法执行之后执行以下方法体的内容，不管是否发生异常。
     * @param jp
     *//*

    @After("execution(* com.mashibing.aspect.bean.TestAnn.*(..))")
    public void afterMethod(JoinPoint jp){
        System.out.println("【后置通知】this is a afterMethod advice...");
    }

*/

//    private BeanFactory beanFactory;
//    private ApplicationContext applicationContext;
//
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
//    }
//
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
}
