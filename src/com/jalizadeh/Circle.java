package com.jalizadeh;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;


// video #21
// https://www.journaldev.com/21429/spring-component
@Component
public class Circle implements Shape {

	private Point center;
	
	@Autowired
	private MessageSource messageSource;
	
	
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}



	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}



	public Point getCenter() {
		return center;
	}



	//video #20
	@Resource(name="pointC")
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Destroy of circle");
	}



	@Override
	public void draw() {
		//video #22
		/*
		System.out.println("Drawing circle");
		System.out.println("Circle: Point is: (" + center.getX() 
				+ ", " + center.getY() + ")");
		*/
		System.out.println(this.messageSource.getMessage("draw.circle", null, "Default msg", null));
		System.out.println(this.messageSource.getMessage("points.circle", 
				new Object[] {center.getX(), center.getY()}
				, "Default msg", null));
		System.out.println(this.messageSource.getMessage("greeting", null, "Default msg", null));
	}
	
}
