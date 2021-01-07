package com.dg.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	//Vehicle obj = (Vehicle)context.getBean("vehicle"); //for xml based configuration
    	Vehicle obj = (Vehicle)context.getBean("car"); //for annotation based configuration
    	obj.drive();
    }
}
