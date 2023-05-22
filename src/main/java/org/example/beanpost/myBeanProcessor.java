package org.example.beanpost;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class myBeanProcessor implements BeanPostProcessor {

    public Object postProcessBeforInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Categroy categroy = (Categroy) bean;
        categroy.setName("user2");
        return categroy;
    }
}
