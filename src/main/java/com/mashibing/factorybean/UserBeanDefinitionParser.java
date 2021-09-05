package com.mashibing.factorybean;

import lombok.SneakyThrows;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    @SneakyThrows
    @Override
    protected Class<?> getBeanClass(Element element) {
        String classname = element.getAttribute("classname");
        if(StringUtils.hasText(classname)) {
            ClassLoader loader = ClassLoader.getSystemClassLoader();
            Class clazz = loader.loadClass(classname);
            return clazz.getClass();
        }
        return User.class;
    }
    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
//        super.doParse(element, builder);
        String username = element.getAttribute("username");
        String password = element.getAttribute("password");
        String email = element.getAttribute("classname");
        String classname = element.getAttribute("classname");
        if(StringUtils.hasText(classname)) {
            builder.addPropertyValue("classname",classname);
        }
        if(StringUtils.hasText(username)){
            builder.addPropertyValue("username",username);
        }
        if(StringUtils.hasText(password)){
            builder.addPropertyValue("password",password);
        }
        if(StringUtils.hasText(email)){
            builder.addPropertyValue("email",email);
        }
        System.out.println(builder.getBeanDefinition().getBeanClass() + "---------------------");
    }
}
