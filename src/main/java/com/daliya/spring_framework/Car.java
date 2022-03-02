/**
 * 
 */
package com.daliya.spring_framework;

import org.springframework.stereotype.Component;

/**
 * @author Daliya
 *
 */
@Component

//default name of the bean will be non-qualified and decapitalized
public class Car implements Vehicle {
	public void drive() {
		System.out.println("Car is moving");
	}

}
