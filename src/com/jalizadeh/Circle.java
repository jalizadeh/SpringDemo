package com.jalizadeh;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;

	
	
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
		System.out.println("Drawing circle");
		System.out.println("Circle: Point is: (" + center.getX() 
				+ ", " + center.getY() + ")");
	}
	
}
