package com.jalizadeh;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

						//video #12
public class Triangle implements ApplicationContextAware, BeanNameAware{
	
	
	
	/*
	//video #5
	private String type;
	
	
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	//#5------------


	//#6
	private int height;
	private int length;
	
	public int getHeight() {
		return height;
	}
	
	public int getLenght() {
		return length;
	}
	
	public Triangle(int height) {
		this.height = height;
	}
	
	public Triangle(String type) {
		this.type = type;
	}
	
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}
	//#6---------------------
	
	
	public void draw() {
		System.out.println(getType() + " Triangle drawn " + getHeight());
	}
	
	*/
	
	
	//video #7 & #9
	/*private Point point0;
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
	*/
	
	
	
	//video #10
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void drawPoints() {
		System.out.println("A: " + pointA);
		System.out.println("B: " + pointB);
		System.out.println("C: " + pointC);
	}
	
	//video #12 
	private ApplicationContext context;
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
		//System.out.println("context: " + context.getDisplayName());
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
		
	}
	
	
	
	/*
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void drawPoints() {
		for(Point p : points)
			System.out.println("point: " + p);
		
	}
	*/
}
