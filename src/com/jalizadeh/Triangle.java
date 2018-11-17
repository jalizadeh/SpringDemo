package com.jalizadeh;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class Triangle implements Shape {
	private Point point0;
	private Point point1;
	private Point point2;
	
	
	
	public Point getPoint0() {
		return point0;
	}



	public Point getPoint1() {
		return point1;
	}



	public Point getPoint2() {
		return point2;
	}



	public void setPoint0(Point point0) {
		this.point0 = point0;
	}



	public void setPoint1(Point point1) {
		this.point1 = point1;
	}



	public void setPoint2(Point point2) {
		this.point2 = point2;
	}



	public void drawPoints() {
		System.out.println("A: " + point0);
		System.out.println("B: " + point1);
		System.out.println("C: " + point2);
	}



	@Override
	public void draw() {
		System.out.println("Drawing tirangle");
		System.out.println("A: " + point0);
		System.out.println("B: " + point1);
		System.out.println("C: " + point2);
		
	}

}
