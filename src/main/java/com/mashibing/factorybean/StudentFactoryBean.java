package com.mashibing.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class StudentFactoryBean  implements FactoryBean {

    public Object getObject() throws Exception {
        return new User();
    }

    public Class<?> getObjectType() {
        return User.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
