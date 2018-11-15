package com.jalizadeh;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 
 * @author Javad Alizadeh
 * @see {@link https://www.youtube.com/watch?v=7c6ZTF6cF88&list=PLGibysfsUS7NAbefiaj1V4LbX0glTftDI}
 *
 */
public class Main {

	public static void main(String[] args) {
		//xml must be located in "src" folder
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//getBean by Id
		Triangle triangle = (Triangle) context.getBean("triangle");		
		

		triangle.drawPoints();
		
		//to prevent resource leak
		context.close();

	}

}
