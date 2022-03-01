package com.daliya.spring_framework;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//      System.out.println( "Hello World!" );
    	
//    	Car car = new Car();
//    	car.drive();
    	
//    	Bike bike = new Bike();
//    	bike.drive();
    	
//    	Vehicle vehicleObject = new Car();
//    	vehicleObject.drive();
    	
//    	BeanFactory is the interface used for smaller pjcts and bf is  subset of appln context 
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	Vehicle vehicleObject =(Vehicle) context.getBean("vehicle");
    	vehicleObject.drive();
    }
    
    
}
