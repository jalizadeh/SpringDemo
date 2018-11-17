package com.jalizadeh;

import org.springframework.beans.factory.annotation.Required;

public class Circle implements Shape {

	private Point center;

	
	
	public Point getCenter() {
		return center;
	}



	/*
	 * video #18
	 * 
	 * Using annotation "Required", forces the Spring to raise the exception
	 * before calling the "shape.draw();"
	 * This way, it will show which bean is missed or NULL
	 * Otherwise, there is only "NULLPOINTEREXCEPTION" error without
	 * being identified, which line is producing the error
	 */
	@Required
	public void setCenter(Point center) {
		this.center = center;
	}



	@Override
	public void draw() {
		System.out.println("Drawing circle");
		System.out.println("Circle: Point is: (" + center.getX() 
				+ ", " + center.getY() + ")");
	}
	
}
