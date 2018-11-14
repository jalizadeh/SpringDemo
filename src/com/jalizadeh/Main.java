package com.jalizadeh;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


/**
 * 
 * @author Javad Alizadeh
 * @see {@link https://www.youtube.com/watch?v=7c6ZTF6cF88&list=PLGibysfsUS7NAbefiaj1V4LbX0glTftDI}
 *
 */
public class Main {

	public static void main(String[] args) {

		//Triangle triangle = new Triangle();
		
		/*
		@Deprecated
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		*/
		
		//xml must be located in "src" folder
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//getBean by Id
		//Triangle triangle = (Triangle) context.getBean("triangle");		
		
		//or using alias
		Triangle triangle = (Triangle) context.getBean("triangle-alias");
		//triangle.draw();
		triangle.drawPoints();
		
		//to prevent resource leak
		context.close();

	}

}
