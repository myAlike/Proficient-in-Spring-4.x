package com.smart._02simple;

import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanRetrieveTest {

	public ApplicationContext factory = null;

	private static String[] CONFIG_FILES = {"com/smart/_02simple/beans.xml"};

	@BeforeClass
	public void setUp() throws Exception {
		factory = new ClassPathXmlApplicationContext(CONFIG_FILES);
	}

	@Test
	public void testBeanRetrieve(){
		Car car = (Car)factory.getBean("car");
		System.out.println(car);
		assertNotNull(car);
	}
	@Test
	public void testBeanRetrieve2(){
		Car car = (Car)factory.getBean("#car1");
		System.out.println(car);
		assertNotNull(car);
	}

	@Test
	public void testBeanRetrieve3(){
		Car car = (Car)factory.getBean("$car");
		System.out.println(car);
		assertNotNull(car);
	}

	@Test
	public void testBeanRetrieve4(){
		Car car1 = (Car)factory.getBean("com.smart._02simple.Car");
		Car car = (Car)factory.getBean("com.smart._02simple.Car#1");
		System.out.println(car);
		assertNotNull(car);
	}
}
