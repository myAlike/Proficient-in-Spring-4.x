package com.smart._04beanfactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class _02AnnotationApplicationContextTest {
    @Test
    public void getBean() {
        //通过一个带@configuration的POJP装载bean配置
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Car car = ctx.getBean("car", Car.class);
    }
}
